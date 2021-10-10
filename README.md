<a name="top"></a>


[<img src="Buttons/SVG/sql database.svg" height="35" width="auto"/>](#database)
[<img src="Buttons/SVG/java projects.svg" height="35" width="auto"/>](#java)
[<img src="Buttons/SVG/python projects.svg" height="35" width="auto"/>](#python)
[<img src="Buttons/SVG/vim.svg" height="35" width="auto"/>](#vim)
[<img src="Buttons/SVG/graphic design.svg" height="35" width="auto"/>](#graphicdesign)
<br><br>
[<img src="Buttons/SVG/bottom of page.svg" height="35" width="auto"/>](#bottom)
<br>

https://user-images.githubusercontent.com/90723578/136682515-562cd1b8-dd9e-44ce-88bb-776dd553bf5a.mp4






<hr><br><hr><br>

<a name="database"></a> 
## SQL Database Work 
[<img src="Buttons/SVG/see more sql database work.svg" height="34" width="auto"/>](Database)
<hr>

Coming soon...



<hr><br><hr><br>

<a name="java"></a>
## Java Projects 
[<img src="Buttons/SVG/see more java projects.svg" height="34" width="auto"/>](JavaProjects)
<hr>



https://user-images.githubusercontent.com/90723578/136681997-f5c74bb6-6f57-4d3c-84cc-de1064729ad6.mp4






<hr><br><hr><br>

<a name="python"></a>
## Python Projects 
[<img src="Buttons/SVG/see more python projects.svg" height="34" width="auto"/>](PythonProjects)
<hr>


Coming soon...




<hr><br><hr><br>

<a name="vim"></a>
## Vim Configuration & Tips 
[<img src="Buttons/SVG/see full vim configuration.svg" height="34" width="auto"/>](Vim)
<hr>



### My favorite remaps
This is super fun to use. I call it "nudging". Make a selection in visual mode, and nudge it up or down 1 line using J or K.
```vim
vnoremap J :m '>+1<CR>gv=gv
vnoremap K :m '<-2<CR>gv=gv
```
Also, smart open braces is super useful. When you type an open curly brace and hit tab, it will autofill the close brace and put your cursor on the line between them.
```vim
inoremap {<Tab> {<CR>}<Esc>ko
```
### Remaps for editing HTML files
Firstly, I use a plugin called [Emmet](https://github.com/mattn/emmet-vim) to help edit html files. It's extremely useful.
Additionally, here are some remaps I added to my vimrc that will execute when a .html file is opened.

Here's a command I wrote to help me edit new html files faster by populating an empty page with everything I need to get started with. <br>
Why is it cool? Using vimscript, it will autofill today's date, using ```=strftime("%m/%d/%y)```
```vim
autocmd FileType html nnoremap <Leader>,, 
    \i<!-- Author:  Ryan Young --><CR><!-- Created:  <Esc>"=strftime("%m/%d/%y")<CR>Pa --><CR><!DOCTYPE html><CR>
    \<html></html><Esc>%i<CR><Esc>O<head></head><Esc>%i<CR><Esc>O
    \<style></style><Esc>%i<CR><Esc>O<Tab><Tab><Tab>body {} h1 {}<Esc>jo
    \<meta charset="utf-8"><CR><title></title><Esc>jo
    \<body></body><Esc>%i<CR><Esc>O
```
When the keymap is executed in an html file, it will fill the page with the following:
```html
<!-- Author:  Ryan Young -->
<!-- Created: 10/09/21 -->
<!DOCTYPE html>
<html>
  <head>
    <style>
      body {} h1 {}
    </style>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>

  </body>
</html>

```

When you're using a lot of ```<i>```, ```<em>```, ```<b>```, etc., you'll find it can be very cumbersome to remove these modifiers by hand since you have two parts to delete. Here's another html remap that makes this process much faster:
```vim
autocmd FileType html nnoremap <Leader>,d2 i`<Esc>lvf>d<Esc>hf<vf>d<Esc>F`x
```

Use the command above while your cursor is hovering over the first angle bracket of the ```<em>``` element in the following text...
```html
<p>Here is some <em>emphasized</em> text in html.</p>
```
The result will look like:
```html
<p>Here is some emphasized text in html.</p>
```
Sweet! That was fast.

<hr><br><hr><br>

<a name="graphicdesign"></a>
## Graphic Design 
[<img src="Buttons/SVG/see more graphic design.svg" height="34" width="auto"/>](GraphicDesign)
<hr>


<img width="1530" alt="Infographic" src="https://user-images.githubusercontent.com/90723578/136671701-fc9b75e8-a4a1-4251-8d4a-fcc3476932b3.png">


<br><hr><br>

<a name="bottom"></a>
[<img src="Buttons/SVG/top of page.svg" height="35" width="auto"/>](#top)
