[<img src="../Buttons/SVG/back.svg" height="35" width="auto"/>](../TEST_README.md/#vim)
<br>

# Vim Configuration
<hr>

Your ```vimrc``` can get very long, very quickly. To keep things organized, I have my ```vimrc``` split up into **3 files**: <br>
Note: In addition to your ```vimrc```, you can put other ```.vim``` files in your ```~/vimfiles/plugin``` directory. Keep in mind, vim will read these files AFTER your ```vimrc```. <br>
My configuration consists of 3 files: ```~/_vimrc```, ```~/vimfiles/plugin/remaps.vim```, and ```~/vimfiles/plugin/sets.vim```. This gets most of my sets and remaps out of the way, which makes working on my ```vimrc``` much easier. <br><br>

Here are each of those 3 files, in their respective order. (Updated 10/9/2021)
<hr>

### _vimrc
```vim
syntax on
augroup numbertoggle
    "Number mode changes between insert and normal mode
    autocmd!
    autocmd BufEnter,FocusGained,InsertLeave,WinEnter * if &nu && mode() != "i" | set rnu   | endif
    autocmd BufLeave,FocusLost,InsertEnter,WinLeave   * if &nu                  | set nornu | endif
augroup END

call plug#begin('~/vimfiles/plugged')

Plug 'gruvbox-community/gruvbox'
Plug 'leafgarland/typescript-vim'
Plug 'ctrlpvim/ctrlp.vim'
Plug 'mbbill/undotree'
Plug 'maxboisvert/vim-simple-complete'
Plug 'jsborjesson/vim-uppercase-sql'
Plug 'junegunn/fzf.vim'
Plug 'junegunn/fzf', { 'do': { -> fzf#install() } }
Plug 'itchyny/lightline.vim'
Plug 'shinchu/lightline-gruvbox.vim'
Plug 'mattn/emmet-vim'

call plug#end()

colorscheme gruvbox
let g:gruvbox_contrast_light='soft'
let g:gruvbox_contrast_dark='soft'
let g:gruvbox_number_column='bg0'

let g:ctrlp_user_command = ['.git', 'cd %s && git ls-files -co --exclude-standard']

let g:netrw_banner=0
let g:netrw_browse_split=2
let g:netrw_winsize = 25

let g:ctrlp_match_window = 'bottom,order:btt,min:1,max:15,results:50'
let g:ctrlp_open_new_file = 't'
let g:ctrlp_working_path_mode = 'rw'

let mapleader = " "

let g:user_emmet_install_global = 0
autocmd FileType html,css EmmetInstall
let g:user_emmet_leader_key='<C-k>'
let g:netrw_altv = 1


let g:lightline = {}
let g:lightline = {'colorscheme': 'gruvbox'}
set laststatus=2
set noshowmode

"Quick access directories
nnoremap <Leader>.home :cd C:\Users\Ryan\ Young\<CR>
nnoremap <Leader>.ryayoung :cd C:\Users\Ryan\ Young\ryayoung<CR>
nnoremap <Leader>.proj :cd C:\Users\ryany\ryayoung\INFO3300<CR>
nnoremap <Leader>.web :cd C:\Users\ryany\web-programming<CR>
nnoremap <Leader>.plugged :cd C:\Users\ryany\vimfiles\plugged<CR>
nnoremap <Leader>.du :cd C:\Users\ryany\Onedrive\ -\ University\ of\ Denver\School\Y4Q1<CR>
nnoremap <Leader>.btr :cd C:\Users\ryany\Onedrive\ -\ University\ of\ Denver\Back\ To\ Roots<CR>
nnoremap <Leader>.www :cd C:\Users\ryany\Onedrive\ -\ University\ of\ Denver\School\Y4Q1\COMP\ 3410\ WWW\ Programming<CR>
nnoremap <Leader>.dw :cd C:\Users\ryany\Onedrive\ -\ University\ of\ Denver\School\Y4Q1\INFO\ 3300\ DW<CR>
nnoremap <Leader>.pm :cd C:\Users\ryany\Onedrive\ -\ University\ of\ Denver\School\Y4Q1\INFO\ 3340\ Project\ Management<CR>
nnoremap <Leader>.mgmt :cd C:\Users\ryany\Onedrive\ -\ University\ of\ Denver\School\Y4Q1\MGMT\ 3000\ Policy\ Strategy<CR>
```
<hr><hr>

## sets.vim
```vim
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

```
<hr><hr>

## remaps.vim
```vim
nnoremap <leader>h :wincmd h<CR>
nnoremap <leader>j :wincmd j<CR>
nnoremap <leader>k :wincmd k<CR>
nnoremap <leader>l :wincmd l<CR>

"Quit
nnoremap <Leader>q :q<CR>

"Shell
nnoremap <Leader>sh :terminal powershell<CR>

"Window commands
nnoremap <Leader>w <C-w>

"Move windows easily
nnoremap <Leader>H :wincmd H<CR>
nnoremap <Leader>J :wincmd J<CR>
nnoremap <Leader>K :wincmd K<CR>
nnoremap <Leader>L :wincmd L<CR>

"CtrlP from buffer
nnoremap <Leader>b :CtrlPBuffer<CR>

"Change background
nnoremap <Leader>1l :set background=light<CR>
nnoremap <Leader>1d :set background=dark<CR>

"Show undo history
nnoremap <leader>u :UndotreeShow<CR>

"Open files
nnoremap <leader>cc :Vex<bar> :vertical resize 20<CR>jj
nnoremap <leader>cx :vs.<bar> :vertical resize 20<CR>jj

"Edit vimrc
nnoremap <Leader>vrc :e $MYVIMRC<CR>

"CtrlP entire system for recently used files
nnoremap <Leader>cd :CtrlPMRU C:/<CR>
nnoremap <Leader>cn :Files<CR>


"Write and source file
nnoremap <Leader>2 :w<bar> :source %<CR>

"Resize windows
nnoremap <Leader>- :vertical resize -20<CR>
nnoremap <Leader>= :vertical resize +20<CR>
nnoremap <Leader>[ :resize -15<CR>
nnoremap <Leader>] :resize +15<CR>

"Paste from sys clipboard
nnoremap <Leader>pa "+p
"Copy to sys clipboard
vnoremap <Leader>co "+y


"shift visual lines up and down
vnoremap J :m '>+1<CR>gv=gv
vnoremap K :m '<-2<CR>gv=gv

"Smart open brackets
inoremap {<Tab> {<CR>}<Esc>ko

augroup htmlmaps
    autocmd!
    autocmd FileType html nnoremap <Leader>,, 
        \i<!-- Author:  Ryan Young --><CR><!-- Created:  <Esc>"=strftime("%m/%d/%y")<CR>Pa --><CR><!DOCTYPE html><CR>
        \<html></html><Esc>%i<CR><Esc>O<head></head><Esc>%i<CR><Esc>O
        \<style></style><Esc>%i<CR><Esc>O<Tab><Tab><Tab>body {} h1 {}<Esc>jo
        \<meta charset="utf-8"><CR><title></title><Esc>jo
        \<body></body><Esc>%i<CR><Esc>O

    autocmd FileType html nnoremap <Leader>,d1 vf>d<Esc>
    autocmd FileType html nnoremap <Leader>,d2 i`<Esc>lvf>d<Esc>hf<vf>d<Esc>F`x

augroup END

augroup sqlmaps
    autocmd!
augroup END

```
