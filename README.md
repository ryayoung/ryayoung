<a name="top"></a>

# Here is some of my work


[<img src="Buttons/SVG/graphic design.svg" height="35" width="auto"/>](#graphicdesign)
[<img src="Buttons/SVG/sql database.svg" height="35" width="auto"/>](#database)
[<img src="Buttons/SVG/java projects.svg" height="35" width="auto"/>](#java)
[<img src="Buttons/SVG/python projects.svg" height="35" width="auto"/>](#python)
[<img src="Buttons/SVG/vb.svg" height="35" width="auto"/>](#vb)
[<img src="Buttons/SVG/vim.svg" height="35" width="auto"/>](#vim)
[<img src="Buttons/SVG/bottom of page.svg" height="35" width="auto"/>](#bottom)
<br>

## A quick UI demo

This is a VB.NET application I made that communicates with an OLTP database.
<br>***This video is just a UI demonstration.*** For a walkthrough of the project, see the [SQL Database](#database) section.
<br>(Unmute for narration)<br>

https://user-images.githubusercontent.com/90723578/136682515-562cd1b8-dd9e-44ce-88bb-776dd553bf5a.mp4

<hr>

<a name="graphicdesign"></a>
<br><br>
# Graphic Design 
[<img src="Buttons/SVG/see more graphic design.svg" height="34" width="auto"/>](GraphicDesign/README.md/#top)
<hr>

## Select one...

<table>
  <tr>
    <th><b>Infographic</b></th>
    <th><b>App Prototype</b></th>
  </tr>
  <tr>
    <td><a href="GraphicDesign/Infographic.md/#top"><img src="Buttons/PNG/youtube infographic.png" height="240" width="auto"/></a></td>
    <td><a href="GraphicDesign/MobileApp.md/#top"><img src="Buttons/PNG/alphanote.png" height="240" width="auto"/></a></td>
  </tr>
  <tr>
    <th><b>Brand Guide</b></th>
    <th><b>Logo Design</b></th>
  </tr>
  <tr>
    <td><a href="GraphicDesign/BrandGuide.md/#top"><img src="Buttons/PNG/anode.png" height="240" width="auto"/></a></td>
    <td><a href="GraphicDesign/LogoDesign.md/#top"><img src="Buttons/PNG/more than a word.png" height="240" width="auto"/></a></td>
  </tr>
</table>


<hr>

<a name="database"></a>
<br><br>
# SQL Database Work 
[<img src="Buttons/SVG/see the full project sql.svg" height="34" width="auto"/>](Database)
<hr>

## Karve Ski Demos

Karve is an online ski demo subscription for enthusiasts who always want the ideal gear for current snow conditions. Members have access to hundreds of skis at the touch of a button, delivered to their doorstep, with the freedom to swap products at any time with no additional cost.

To see how I populated this database with thousands of rows of realistic data by simulating normal and skewed distributions for customer measures based on gender, adding seasonality for consumer behavior, simulating ski damage patterns, and much more, see [Python Projects](#python).

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

## Generating Highly Realistic Data to Populate a Database
Nearly all of the data in the [Karve OLTP database](#database) above was generated using a series of lengthy Python scripts, but *very few* attributes are truly randomized.
#### The program must do the following:

1. Simulate real business patters
    * Create an order volume distribution that's bimodal, peaking in Dec. and Mar. Then, _based on time of season_, choose how the length of time customers keep skis for will be distributed. This is skewed right for most of the season, but shortens in the spring since all rentals _must_ be returned by July 7th.   
   * Choose how often skis get damaged, which types of damage are most common, how often multiple (2-3) damages occur in one rental event, how often a ski gets totaled/broken, and which types of critical damage are most common. And, when a ski does get totaled, update records to permanently prevent it from being rented again.

2. Simulate a realistic distribution for each measure and include dependencies
    * Pick what percent of customers are male/female.
    * Height will be normally distributed based on gender.
    * Weight will be based on height, and also normally distributed differently based on gender.
    * Boot size will be normally distributed based on gender.
    * Boot sole length will be based on boot size and then randomized within 3 millimeters.
    * Skier ability level will be slightly skewed towards advanced skiers
    * Days Used (# of days a customer _claims_ to have actually used the ski) will roughly correlate with the # of days between order and return date.

#### Here are a few histograms of the simulated data:

<table>
  <tr>
    <td><img src="https://github.com/ryayoung/data-warehousing/blob/main/KarveAutomation/plots/customer_weights.png" height="250" width="auto"></td>
    <td><img src="https://github.com/ryayoung/data-warehousing/blob/main/KarveAutomation/hist_days_kept.png" height="250" width="auto"></td>
  </tr>
</table>

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



### Maps
<hr>

### Quick Marks: Quickly create and auto-toggle global garks
This is an original idea, in which I create a map that actually re-maps itself each time it's called. Sweet!

Marks, while extremely useful, are a bit cumbersome to use. Do you ever forget which marks map to which places, accidentally try to use a local mark globally, create too many marks and lose track of them, or find that the syntax is too cumbersome for quickly switching between two marks?

This script streamlines the most common use case for marks, making your workflow more efficient:
```vim
nnoremap mm mM:echo "MARK 1 SET"<CR>
nnoremap mM mK:echo "MARK 2 SET"<CR>
nnoremap <Leader>m 'M:call ToggleMarkerGo()<CR>
let g:marker_go = 1
function! ToggleMarkerGo()
  if g:marker_go > 0
    nnoremap <Leader>m 'K:call ToggleMarkerGo()<CR>
    echo "MARK 1"
  else
    nnoremap <Leader>m 'M:call ToggleMarkerGo()<CR>
    echo "MARK 2"
  endif
  let g:marker_go = -g:marker_go
endfunction
```
How do you use it? First, "mm" sets global mark 1, and "mM" sets global mark 2. This simplifies the process of creating global marks and makes it intuitive to remember which one is which: ```nnoremap mm mM:echo "MARK 1 SET"<CR>```. Now for the fun part. Once you've set the two marks, ```<Leader>m``` will toggle between them. If you have your spacebar set as your leader key, this is an extremely fast command to press. Better yet, this eliminates the need for you to remember which mark is which. You can simply move to the "other" one.


### Quickly nudge lines up and down
This is super fun to use. I call it "nudging". Make a selection in visual mode, and nudge it up or down 1 line using J or K.
```vim
vnoremap J :m '>+1<CR>gv=gv
vnoremap K :m '<-2<CR>gv=gv
```

### Maps for editing HTML files
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
When the map is executed in an html file, it will fill the page with the following:
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

When you're using a lot of ```<i>```, ```<em>```, ```<b>```, etc., you'll find it can be very cumbersome to remove these modifiers by hand since you have two parts to delete. Here's another html map that makes this process much faster:
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



<br><hr><br>

<a name="bottom"></a>
[<img src="Buttons/SVG/top of page.svg" height="35" width="auto"/>](#top)
