
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

