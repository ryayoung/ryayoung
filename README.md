<a name="top"></a>

# Here is some of my work


[<img src="Buttons/SVG/sql database.svg" height="35" width="auto"/>](#database)
[<img src="Buttons/SVG/java projects.svg" height="35" width="auto"/>](#java)
[<img src="Buttons/SVG/python projects.svg" height="35" width="auto"/>](#python)
[<img src="Buttons/SVG/vb.svg" height="35" width="auto"/>](#vb)
[<img src="Buttons/SVG/vim.svg" height="35" width="auto"/>](#vim)
[<img src="Buttons/SVG/graphic design.svg" height="35" width="auto"/>](#graphicdesign)
[<img src="Buttons/SVG/bottom of page.svg" height="35" width="auto"/>](#bottom)
<br>

## A quick UI demo

This is a VB.NET application I made that communicates with an OLTP database.
<br>***This video is just a UI demonstration.*** For a walkthrough of the project, see the [SQL Database](#database) section.
<br>(Unmute for narration)<br>

https://user-images.githubusercontent.com/90723578/136682515-562cd1b8-dd9e-44ce-88bb-776dd553bf5a.mp4




<hr>

<a name="database"></a>
<br><br>
# SQL Database Work 
[<img src="Buttons/SVG/see the full project sql.svg" height="34" width="auto"/>](Database)
<hr>

## Karve Ski Demos

Karve is an online ski demo subscription for enthusiasts who always want the ideal gear for current snow conditions. Members have access to hundreds of skis at the touch of a button, delivered to their doorstep, with the freedom to swap products at any time with no additional cost.

To see how I populated this database with thousands of rows of realistic data by simulating normal and skewed distributions for customer measures based on gender, adding seasonality for consumer behavior, simulating ski damage patterns, and much more, see [Python Projects](PythonProjects/README.md/#top).

Here is the diagram for Karve's OLTP database.

![image](https://user-images.githubusercontent.com/90723578/136710522-a44f98dc-d7bf-4756-89f2-b80a134231af.png)

#### For an in-depth walkthrough of this project, [see more SQL/Database work](Database)



<hr>

<a name="java"></a>
<br><br>
# Java Projects 
[<img src="Buttons/SVG/see more java projects.svg" height="34" width="auto"/>](JavaProjects)
<hr>

## Maze
This program randomly generates a unique maze, then solves it. Designed to run slowly in order to visualize what's going on, the pathfinder can recognize short dead-ends and avoid them. When the maze is complete, the path corrects itself, removing all dead-ends and revealing the shortest possible path to the finish line.

https://user-images.githubusercontent.com/90723578/136681997-f5c74bb6-6f57-4d3c-84cc-de1064729ad6.mp4






<hr>

<a name="python"></a>
<br><br>
# Python Projects 
[<img src="Buttons/SVG/see more python projects.svg" height="34" width="auto"/>](PythonProjects)
<hr>


Coming soon...

<a name="vb"></a>
<br><br>
# VB.NET Application 
[<img src="Buttons/SVG/see the full project vb.svg" height="34" width="auto"/>](VisualBasic)
<hr>

Description coming soon...
![sc_Search](https://user-images.githubusercontent.com/90723578/136726037-5e793725-719e-4475-a341-eea0211097c1.png)


<hr>

<a name="vim"></a>
<br><br>
# Vim Configuration & Tips 
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

<hr>

<a name="graphicdesign"></a>
<br><br>
# Graphic Design 
[<img src="Buttons/SVG/see more graphic design.svg" height="34" width="auto"/>](GraphicDesign/README.md/#top)
<hr>

### Fall 2018 Infographic Contest - Daniels College of Business
#### 2nd Place Winner
<hr>

I created this infographic with the goal of grabbing attention, since the contest was based on student votes.

In the real world, this type of design is quite overkill, with too much detail and color.

If its purpose were to communicate information effectively (as an infographic should) it would need to be simplified and use more white space.

<img width="1530" alt="Infographic" src="https://user-images.githubusercontent.com/90723578/136671701-fc9b75e8-a4a1-4251-8d4a-fcc3476932b3.png">


<br><hr><br>

<a name="bottom"></a>
[<img src="Buttons/SVG/top of page.svg" height="35" width="auto"/>](#top)
