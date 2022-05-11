
## **Visual Studio Code**: A better alternative to JupyterLab and Jupyter Notebooks

> Microsoft has worked very hard to make their Jupyter extension for VS Code faster and easier to use than JupyterLab, while also offering a more useful set of features, some of which I and many others cannot live without.

#

<details><summary><b>What's VS Code?</b></summary>

It's the most popular all-purpose text editor/development environment of all time. And it's *nothing* like Visual Studio. It's meant to be as lightweight and performant as possible, while offering a massive, easy to access marketplace for extensions/plugins to suit any need you have - all of which can be enabled with one click. Here are the results of the 2021 StackOverflow survey of about 80,000 developers, asked which development environment they use:

<img width="600" alt="image" src="https://user-images.githubusercontent.com/90723578/167718718-6d9feeff-211e-40fb-bbe7-66a11e54d7b8.png">
</details>

#

<details><summary><b>Why is it so much better?</b></summary>

- **Data viewer**: Every dataframe you create can be viewed in a separate window as a full table, where you can click column headers to sort by that column, or type in a search box in any column to filter and find specific values.
- **Coding Experience**: Since VS Code is the most popular editor for programmers, it's no surprise it's equipped with amazing code-completion, syntax highlighting, auto-indent, and hundreds of other built-in tools and extensions to improve your coding experience. You can jump to source-code definition of a function with one click, rename all instances of a variable at once, and do many other cool things.
- **You can open any filetype**: You can open/edit excel files AND csv files in a table format (see pictures below). This is great! If you're working with excel files in your code, VS Code can open them alongside your code in milliseconds. And, of course, you can open files in any programming language.
- **Outline Navigation**: No more "table of contents" section! In your notebook, a navigation hierarchy is built automatically for you. Every markdown header you write (typing `## etc.` in a markdown cell) will go into the outline window, where you can click on headers to navigate your notebook. This eliminates the need to build a "table of contents" section at the top of your notebook.
- **Instant Startup**: VS Code opens and loads your workspace very quickly. No more Anaconda Navigator, or using terminal to start JupyterLab.
- **Superior File Navigation Window**: You'll figure this one out for yourself. The file navigation sidebar in VS Code is fantastic.

</details>

#

<details><summary><b>Is there a learning curve?</b></summary>

Absolutely not. The Jupyter environment in VS Code will at first appear to work exactly the same as you're used to, but you'll discover some features that blow your mind, if you're coming from JupyterLab.

</details>

#

## Quick Start Guide

#### 1. [Download Here](https://code.visualstudio.com/)
- Don't worry about the questions it asks you upon first launch. Just get through them.

#### 2. User Interface
- Don't open files. Open folders. Go to File > Open Folder, and select the root of where you'll be working. This could be a folder containing many projects. It's up to you.
- You'll use the far left sidebar for navigation. I only use two of those icons in my workflow:
- Files/code editor:
    - <img width="40" alt="image" src="https://user-images.githubusercontent.com/90723578/167726971-4dc2a633-6382-490a-9490-5174dde835bf.png">
- Extensions:
    - <img width="40" alt="image" src="https://user-images.githubusercontent.com/90723578/167727056-109fe785-f63e-495d-a118-4e1718b88320.png">

#### 3. Extensions!

Download the following extensions. I'll explain below.

1. Jupyter
2. Jupyter Notebook Renderers
3. Excel Viewer
4. Rainbow CSV
5. Edit csv

| Jupyter | Excel |
| :- | :- |
| <img width="300" alt="image" src="https://user-images.githubusercontent.com/90723578/167719169-144340e3-f2bd-4487-876d-2f8efbf77257.png"> | <img width="300" alt="image" src="https://user-images.githubusercontent.com/90723578/167719420-f1ea995c-e9b7-4910-98a9-bdf39ce1d231.png"> |
| **CSV** | |
| <img width="300" alt="image" src="https://user-images.githubusercontent.com/90723578/167719606-0f85e517-fdb5-47f8-b13c-583e423f6a98.png"> | |


#### 4. The Basics

- File Navigator

  - File navigation works similar to Mac OS, where you can expand/contract directories like a tree, instead of paginating in and out of them.
  - To create new files, right click a folder in your sidebar. You'll need to write the file extension in the name, so VS Code can figure out what type of file it is. (Ex. `.ipynb` or `.py`)

- Settings and Shortcuts
  - Everything related to VS Code's configuration lies in the command palette. Use `Ctrl+Shift+P` (windows) or `Cmd+Shift+P` (mac) to open it up. (Example: type "keyboard shortcuts" inside command palette). Some important things have their own dedicated shortcuts. Type `Cmd+,` to see your Settings. To change color theme, search "theme" from inside settings.

<br>

#

<br>

# Using Jupyter
---

### Cool Feature #1: **Data Viewer**

Every pandas dataframe you create goes into Jupyter Variables. Click "Variables" in the top ribbon to open one in a separate spreadsheet window.

| 1. See Variables | 2. Select one | |
| :- | :- | - |
| <img width="300" alt="image" src="https://user-images.githubusercontent.com/90723578/167737994-90d9830c-58cc-4636-80bf-24903514f1de.png"> | <img width="300" alt="image" src="https://user-images.githubusercontent.com/90723578/167738102-b6f99e68-83c4-4f05-af34-5e9d7c98f38c.png"> |
| **Refresh** | **Toggle Sort** | **Filter** |
| <img width="150" alt="image" src="https://user-images.githubusercontent.com/90723578/167738349-54659aea-a6db-440c-90ef-cb5b5a23a655.png"> | <img width="150" alt="image" src="https://user-images.githubusercontent.com/90723578/167738431-5d041ba5-431d-472f-a91b-5e940813998c.png"> | <img width="150" alt="image" src="https://user-images.githubusercontent.com/90723578/167738508-0972a7ff-afc2-49fd-abfd-2df81afba374.png"> |

#

### Cool Feature #2: **Coding Environment**

You've got great syntax highlighting, line numbers, autocomplete, indent-guides, and an unlimited number of color themes to choose from. I use the GitHub theme extension, which comes with all 9 of GitHub's website themes.

| VS Code | JupyterLab |
| - | - |
| <img width="400" alt="image" src="https://user-images.githubusercontent.com/90723578/167730116-0d086623-bf7e-4502-80a8-06a3233d1c4a.png"> | <img width="400" alt="image" src="https://user-images.githubusercontent.com/90723578/167730168-94faad98-9ef6-460d-95e5-2d2212d727fc.png"> |
| <img width="400" alt="image" src="https://user-images.githubusercontent.com/90723578/167730376-91bcf644-9c96-41f1-9bed-386eb26c1c75.png"> |  |

#

### Cool Feature #3: **Outline**

Open any notebook where you've used markdown headers (start a line with `## etc..`). Select the "Outline" tab in the bottom left corner of your screen, while your file navigator sidebar is open.

<img width="250" alt="image" src="https://user-images.githubusercontent.com/90723578/167734541-bd105a3e-4d49-4bc4-aa3b-d78495004aa7.png">

Sweet! We can easily navigate through our notebook. It even creates dropdown folding for us, based on the size of the header. For example, all `##` (h2) headers below a `#` (h1) header will be grouped within the `#` header, which you can expand/contract.

<img width="250" alt="image" src="https://user-images.githubusercontent.com/90723578/167736830-0c6dac12-d3db-4eb6-99f0-f48f2b7edc8f.png">

<br>

# Excel & CSV Files

### Excel

The Excel Viewer extension lets you open excel files inside VS Code. It's amazingly fast, and has only the most basic features you might need:

| View/Edit Cells | Sorting |
| :- | :- |
| <img width="350" alt="image" src="https://user-images.githubusercontent.com/90723578/167720392-ee2bea4d-4d43-4fbe-a24e-72a624fc138a.png"> | <img width="150" alt="image" src="https://user-images.githubusercontent.com/90723578/167720500-627e3cce-a359-4054-9a44-ffd7dcdd7a76.png"> |

### Rainbow CSV, and Edit csv

When viewing raw csv data, Rainbow CSV simply colors each column's text differently, making it easier to read.

Edit CSV lets you view/edit the file in a table form. To enable this, open a file and click the "Edit csv" button in the upper right hand corner

| Rainbow | Edit CSV |
| :- | :- |
| <img width="350" alt="image" src="https://user-images.githubusercontent.com/90723578/167719790-6fd89d41-71b5-4505-a034-dab1862e2db5.png"> | <img width="350" alt="image" src="https://user-images.githubusercontent.com/90723578/167719992-7bb3c6b5-5723-4b20-9142-1e58b7fca6ba.png"> |
| **Enable Edit CSV** | |
| <img width="350" alt="image" src="https://user-images.githubusercontent.com/90723578/167719882-337f3629-edff-48ce-b345-671585611f27.png"> |  |




<!-- # MARKDOWN -->

<!-- MARKDOWN ALL IN ONE -->
<!-- <img width="300" alt="image" src="https://user-images.githubusercontent.com/90723578/167720922-b4cdcaab-e978-49e4-848b-6f1d8599bf95.png"> -->

<!-- MARKDOWN GITHUB -->
<!-- <img width="300" alt="image" src="https://user-images.githubusercontent.com/90723578/167721089-15cf43d3-fc13-4ca7-b6c6-030876ce1563.png">    -->

<!-- MARKDOWN EXAMPLE -->
<!-- <img width="1000" alt="image" src="https://user-images.githubusercontent.com/90723578/167722049-3f8279e6-8b03-450a-9281-663746801f31.png"> -->