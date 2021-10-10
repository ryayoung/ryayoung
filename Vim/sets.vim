set number
set guifont=Consolas:h9 "set font

set lines=50 columns=100 "sets size of window that opens

set guioptions-=m "remove menu bar
set guioptions-=T "remove toolbar
set guioptions-=r "remove right hand scroll bar
set guioptions-=L "remove right hand scroll bar

set autoread "automatically refresh file that's been updated

"set exrc "uses vimrc from directory you open file from                                            
set tabstop=4
set softtabstop=4
set shiftwidth=4
set background=light
set nowrap
"set autochdir "sets directory to that of current file
set nohlsearch "removes highlighting after search
set hidden "allows buffers to remain open in background without saving
set scrolloff=4 "scroll starts when you're x lines from edge
set backspace=2 "allows you to backspace to prev line 
set expandtab "tabs are made with spaces
set autoindent
set smartindent 
set smartcase "when this and ignorecase are turned on, search is case sensitive unless uppercase is used in search
set ignorecase
set noswapfile
set nobackup
set undodir=~/vimfiles/undodir
set undofile
set incsearch
set encoding=utf-8
    
augroup htmlsets
    autocmd!
    autocmd FileType html set tabstop=2
    autocmd FileType html set softtabstop=2
    autocmd FileType html set tabstop=2
    autocmd FileType html set softtabstop=2
    autocmd FileType html set shiftwidth=2
    "autocmd FileType html set background=light
augroup END


augroup sqlsets
    autocmd!
    "autocmd FileType sql set background=light
augroup END
