[<-- **HOME**](README.md)
# Github's Special Markdown Rendering
---
In Github, you can use syntax from both **HTML** and **markdown**. Thus, most things can be done in more than one way. It's best practice to use **markdown** syntax wherever possible. It's simple and easier to read. 

**IMPORTANT MISTAKE TO AVOID**: If you use an HTML element, you **must** leave a blank line **below** it before writing any markdown.

# Use the Github Code Editor
Markdown is something you'll actually need to edit from _inside_ Github, instead of a text editor, because it's the only way to quickly preview your content in its rendered form before committing.

<details>
  <summary><i><b>Click here for tips on using the Github editor</b></i></summary>

- Top left corner: toggle between **Preview** and **Edit file** to see your markdown rendered
- Top right corner:
    - Select **Soft wrap** from the last dropdown to prevent long lines from falling off the page
    - Change the number in the 2nd dropdown to 4. This represents the size of the indent created when you press tab
    - Select **Tabs** from the first dropdown menu. This changes how your indents behave. **Spaces** will simply insert x number of spaces, whereas **Tabs** will create an invisible tab character. To test how this works, press TAB on an empty line, and then backspace.
- Make sure to **commit** to save your changes before leaving the window.
</details>

<br>

# Text Formatting
---

## Headers
#### Place ```#``` at the **beginning** of a line to create a very large header. Use ```##``` and ```###``` to make smaller headers.
- ```####``` will just render **bold** text, no different from wrapping the whole line in double astrix: ```**text**```
- The ```#``` and ```##``` headers will have small divider lines automatically placed below them.

<br>

## Line Breaks & Dividers
### Automatic Line Breaks
- When working with **plain** text on **multiple** lines, put an empty line between them to create a line break.
- **Bulleted text** will automatically break away from the line above, but NOT insert a linebreak after.
- **Headers** will break away from the line above, AND insert a linebreak after.

<details>
  <summary><i><b>How it works:</b></i></summary>
  
Typing the following:
```
This
text
```
will get rendered as:
```
This text
```
whereas the following:
```
This

text
```
will get rendered as:
```
This
text
```
</details>

#

### Manual Line Breaks
- If you just hit enter a bunch of times, notice the extra lines you made don't get rendered

Use the ```<br>``` tag to make as many line breaks as you want. (REMEMBER to follow it with an empty line)

#

### Dividers

1. **Big divider:** Place ```---``` on an empty line to create your own divider. (The HTML equivalent is ```<hr>```).
2. **Small divider:** Place a single ```#``` on its own line.

<br>

## Bold and Italics
#### Wrap text in ```_``` marks for italics, ```**``` marks for bold, or ```**_``` marks for bold & italic. You _cannot_ underline.
- For faster editing, you can use ```Ctrl-i``` and ```Ctrl-b``` just like you normally would in a word processor.
- This syntax will **not** work for text inside html elements, such as tables and images. Instead, bold: ```<b></b>``` italic: ```<i></i>```

<details>
  <summary><i><b>See it in action:</b></i></summary>

### Bold
```markdown
**Here is bold text**
```
### Italic
```markdown
_Here is italic text_
*This is also italic text*
```
### Bold & Italic
```markdown
**_This is bold AND italic text_**
***This is also bold & italic, even though it's not displaying correctly here***
```
</details>


<br>

# Displaying Code
You can display ```<special> [characters]``` in an inline code block. You can also do this:
```swift
print("Swift syntax highlighting")
```
```python
print("Python syntax highlighting")
```

#

There are 3 types of code blocks:
1. **Inline**: Wrap text in triple back ticks: ```` ```code goes here``` ````
2. **Fenced**: Same thing, but back ticks are on separate lines before and after the code block
3. **Fenced with syntax highlighting**: After the opening set of back ticks, specify a language: ```` ```python ````

<details>
  <summary><i><b>Demo:n</b></i></summary>

## Inline:
Here is a sentence with an ```inline code block``` used.

Here is the code: ```` ```inline code block``` ````

## Fenced:
```
Here's a multi-line code block with no syntax highlighting.
```
Here is the code:
````
```
Here's a multi-line code block with no syntax highlighting.
```
````

## Fenced with syntax highlighting:
```python
print("Python syntax highlighting")
```
Here is the code:
````
```python
print("Python syntax highlighting")
```
````
</details>

<br>

# Links
---
#### Markdown (use this syntax when possible): ```[Text To Display](link.goes.here)```
#### HTML (needed in some cases): ```<a href="link.goes.here">Text To Display</a>```

#### 3 main types of links:
1. Absolute: ```[See Google.com](https://www.google.com)```
2. Relative: ```[See readme file](README.md)```
3. Relative (with page position): ```[Top of the readme file](README.md/#top)```
- For #3 to work, the target file (readme.md) must have an invisible name tag ```<a name="top"></a>``` somewhere in the page, at the location you want to link to.

<details>
  <summary><i><b>More details on relative links:</b></i></summary>
  
- Relative links are used for navigating within a repository, or displaying files such as images that are stored locally.
- You can also make an image function as a link by placing a link to the image inside the text field in another link.
- For example: ```[![placeholder](my-image.png)](link-to-navigate-to)```
- But if you do this, you're unable to resize the image. If you need to resize the image, use HTML instead:
    - ```[<img width="500" src="my-image.png"/>](link-to-navigate-to)```

#### Linking to Page Position
- This is useful for navigating long markdown files (such as this one). To implement this, define a target position within a target page by embedding a ```<a name="cool-stuff"></a>``` tag. (This tag's text is empty, so it won't display anything). Then, append ```/#cool-stuff``` at the end of your relative link to the page. So instead of linking to ```(README.md)```, you'd link to ```(README.md/#cool-stuff)```. This technique is great for adding top-of-page buttons at the end of long markdown files.
</details>

<br>

# Embedding Content
---

## Copy Paste
#### This is what makes Github markdown really special. You can copy-paste images, videos, and gifs from your computer directly into the code in a markdown file, and they will be embedded seamlessly.

<details>
  <summary><i><b>See how it works:</b></i></summary>
  
- Github will store them somewhere and generate a unique link in your markdown. A new link is generated each time you paste.
- The link that gets generated is your ONLY way of accessing the content. It doesn't get stored in your repository anywhere.
- For photos, this is an easier alternative to making a relative link to a file stored in your repository.
- For videos, this is your only option. You can't embed with a relative link, and you can't embed a youtube video like you can in a website.

If you copy-paste an image and want to resize it, you'll need to move the generated url into an HTML img tag instead of the markdown tag.
- For example: ```<img width="500" src="my-image.png"/>```
</details>

## Relative Links
You can display any _image_ (not video) in your repository with a relative link to it.
- ```![unused-text](my-directory/my-image.png)```
- If you need to resize it, use HTML instead: ```<img width="500" src="my-directory/my-image.png"/>```

## Download Links
- Make a link that downloads a file with a single click
- Create a raw-url html link to the **absolute url** (not relative) of a file inside your repository:
- ```<a id="raw-url" href="https://github.com/my_name/my_repo/some_path/some_file.docx">Download it Here!</a>```

<br>

# Special HTML Formatting
---

## HTML Tables
These are cool. [This article](https://www.w3schools.com/html/html_tables.asp) provides a great tutorial with examples.

Here is an example to see how they display inside Github:

<table>
  <tr>
    <th>Header</th>
    <th>Header</th>
  </tr>
  <tr>
    <td>Data</td>
    <td>Data</td>
  </tr>
</table>

<details>
  <summary><i><b>See the code:</b></i></summary>
  
```html
<table>
  <tr>
    <th>Column 1</th>
    <th>Column 2</th>
  </tr>
  <tr>
    <td>Data</td>
    <td>Data</td>
  </tr>
</table>
```
</details>

#

Or, you can achieve the same thing with markdown syntax, which is much cleaner and easier to read:

| Header | Header |
| ------ | ------ |
| Data | Data |
| Data | Data |

<details>
  <summary><i><b>See the code:</b></i></summary>
  
```md
| Header | Header |
| ------ | ------ |
| Data | Data |
| Data | Data |
```
</details>

<br>


## Interactive Text Folding (i.e. dropdown)
Did you know you can do this?

<details>
  <summary>CLICK ME!</summary>

- I am an html ```details``` element, closed by default.
</details>
<details open>
  <summary><i><b>CLICK ME!</b></i></summary>

- I am an html ```details``` element, open by default.
</details>

<details>
  <summary><i><b>View code for above elements:</b></i></summary>

```html
<details>
  <summary>CLICK ME!</summary>

- I am an html ```details``` element, closed by default.
</details>

<details open>
  <summary><i><b>CLICK ME!</b></i></summary>

- I am an html ```details``` element, open by default. (Add ```open``` to your ```details``` tag to enable this.)
</details>
```
</details>

#### To display your content _expanded_ instead of _closed_, change ```<details>``` to ```<details open>```.

#

To use an `inline code block` as the **summary text** of your details dropdown, backticks WILL NOT WORK. Instead, use the `<code>` element. For example:
<details>
  <summary><code>my_function()</code></summary>

```python
def my_function():
    pass
```
</details>

The header for the above code looks like:
```html
  <summary><code>my_function()</code></summary>
```

#  

#### Important info on using this feature:

- Notice the empty line between ```summary``` element and the bullet point. This NEEDS to be here, just like with all html elements, since the bullet points are technically markdown.
- Notice the indentation. In order for github to recognize the markdown syntax (bullets, code element) inside the html ```details``` element, everything enclosed must start at 0 indent. If you accidentally indented the bulleted text, it would display as ```- I am an html '''details''' element```
- In this example, I used the html ```<b>``` and ```<i>``` elements to make the summary title bold & italic. This is **not** necessary.
- The ```summary``` element is not actually necessary. Without it, **"Details"** will be displayed instead.


 
<br>

# Comments in Markdown
Use HTML syntax:
```markdown
<!-- This text will be hidden -->
This text will be displayed
```
