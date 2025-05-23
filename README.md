<a name="top"></a>


# [`toolcall`](https://github.com/ryayoung/toolcall)

[![PyPI](https://img.shields.io/pypi/v/toolcall)](https://pypi.org/project/toolcall/)
[![Tests](https://github.com/ryayoung/toolcall/actions/workflows/tests.yml/badge.svg)](https://github.com/ryayoung/toolcall/actions/workflows/tests.yml)
[![codecov](https://codecov.io/gh/ryayoung/toolcall/branch/main/graph/badge.svg)](https://codecov.io/gh/ryayoung/toolcall)
[![License](https://img.shields.io/github/license/ryayoung/toolcall)](https://github.com/ryayoung/toolcall/blob/main/LICENSE)
[![Black](https://img.shields.io/badge/code%20style-black-000000.svg)](https://github.com/psf/black)
[![Pyright](https://img.shields.io/badge/type%20checker-pyright-blue)](https://github.com/microsoft/pyright)

*The agentic framework for building without an agentic framework.*

For working with LLMs, `toolcall` is a boring, unopinionated, but extremely useful library
with a function-tool primitive that provides a scalable, statically-type-safe, and readable
interface and pattern for **manually** defining your own function tools, handling calls to them, and
dynamically dispatching calls across a large group of tools at a time.

<br>

---

<br>

# [`pydantic-identity`](https://github.com/ryayoung/pydantic-identity)

[![PyPI](https://img.shields.io/pypi/v/pydantic-identity)](https://pypi.org/project/pydantic-identity/)
[![Tests](https://github.com/ryayoung/pydantic-identity/actions/workflows/tests.yml/badge.svg)](https://github.com/ryayoung/pydantic-identity/actions/workflows/tests.yml)
[![License](https://img.shields.io/github/license/ryayoung/pydantic-identity)](https://github.com/ryayoung/pydantic-identity/blob/main/LICENSE)
[![Black](https://img.shields.io/badge/code%20style-black-000000.svg)](https://github.com/psf/black)
[![Pyright](https://img.shields.io/badge/type%20checker-pyright-blue)](https://github.com/microsoft/pyright)

**pydantic-identity** provides a way to track the full recursive identity (schema “fingerprint”) of your Pydantic models, in 12 character hash. By storing this identifier along with your data, you can later tell whether two records (even deeply nested) were created under the same conditions: model structure, validation rules, documentation, etc.

## Features

- **Schema Hashing**: Generate a stable hash of a model’s entire schema, recursively (includes nested models).
- **Configurable Tracking**: Choose whether to include things like model/field descriptions, field ordering, default values, union type ordering, relative file path, or custom data in the hash.
- **Full Pydantic Compatibility**: `BaseIdentityModel` inherits directly from `pydantic.BaseModel`, and does **not** alter its behavior, or manipulate its `model_config`. You can safely swap `pydantic.BaseModel` for `BaseIdentityModel` anywhere you want.
- **Caching**: Automatically caches computed hashes for performance. A hash is only computed once per *class definition*, and the hash is lazily computed only when it's first accessed.

<br>

---

<br>

# [`azure-functions-parser`](https://github.com/ryayoung/azure-functions-parser)

![PyPI](https://img.shields.io/pypi/v/azure-functions-parser)
![Tests](https://github.com/ryayoung/azure-functions-parser/actions/workflows/tests.yml/badge.svg)
![License](https://img.shields.io/github/license/ryayoung/azure-functions-parser)


A lightweight decorator that adds FastAPI-like request parsing and validation to Azure Functions HTTP triggers.

## Features

- Automatic parsing and validation of query parameters
- Automatic parsing and validation of JSON request bodies using Pydantic models
- Automatic response serialization for different return types (dict, Pydantic models, strings, etc.)
- Zero configuration required - just add the decorator
- Full type hints and async support

<br>

---

<br>

# [`pydantic-flagged`](https://github.com/ryayoung/pydantic-flagged)

[![PyPI](https://img.shields.io/pypi/v/pydantic-flagged)](https://pypi.org/project/pydantic-flagged/)
[![Tests](https://github.com/ryayoung/pydantic-flagged/actions/workflows/tests.yml/badge.svg)](https://github.com/ryayoung/pydantic-flagged/actions/workflows/tests.yml)
[![License](https://img.shields.io/github/license/ryayoung/pydantic-flagged)](https://github.com/ryayoung/pydantic-flagged/blob/main/LICENSE)
[![Black](https://img.shields.io/badge/code%20style-black-000000.svg)](https://github.com/psf/black)
[![Pyright](https://img.shields.io/badge/type%20checker-pyright-blue)](https://github.com/microsoft/pyright)

**pydantic-flagged** is a small extension of [Pydantic V2](https://docs.pydantic.dev/latest/) that introduces the concept of _flagged fields_. A flagged field is defined by its name matching a condition––for example, ending with an underscore (`_`). Once flagged fields are identified, you can `include` or `exclude` them from serialization with a simple API.

<br>

---

<br>

# [`firedis`](https://github.com/ryayoung/firedis)

A faster, type-safe Python client for your **local** Redis server. Optimized for high
frequency, synchronous transactions over a **Unix socket, or localhost**

<br>

---

<br>


# [`templatify`](https://github.com/ryayoung/templatify) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="https://pypi.org/project/templatify/"><img src="https://img.shields.io/pypi/v/templatify.svg" height="21"/></a>

An essential tool for every prompt engineer, `templatify` is a string templating tool that brings Jinja2 **into your python code**.
- **Easy to use**: No need to manually configure an environment manually. But you still have full control over the environment if needed.
- **Declarative**: It's irrefutably clear that the string you've written is a template
- **Dynamic Code Generation**: The `@template` decorator will dynamically create a function whose signature is identical to the one you've written, and that passes arguments to your template. This achieves both **runtime** safety, (since your parameter names are *already* validated against all dependencies of the template) and **static** type safety, since your type checker will respect the function you've written, as-is.

```py
@template
def greet_user(name: str, age: int = 10):
    "Hello, {{ name|upper }}! You are {{ [1,2,3,4]|random }} years old."
```

<br>

---

<br>

# [`debuggpt`](https://github.com/ryayoung/debuggpt) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="https://pypi.org/project/debuggpt/"><img src="https://img.shields.io/pypi/v/debuggpt.svg" height="21"/></a>

When your code breaks, `debuggpt` has a clearer picture of what happened than you do, _before_ it even communicates with an LLM.

When placed over a function that fails, `@debug_gpt` sends GPT-4 a comprehensive report on the state of your program at the moment an error occurs. The LLM will see an in-depth walkthrough of the call stack, with annotated blocks of source code, the types and values of objects at key moments, a history of your printed outputs, the original traceback, and more.


<br>

---

<br>

# [`dictkit`](https://github.com/ryayoung/dictkit) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="https://pypi.org/project/dictkit/"><img src="https://img.shields.io/pypi/v/dictkit.svg" height="21"/></a>

Greatly enhanced dictionaries, with a Pandas-like API, pretty representation, and algorithms for complex transformations and aggregations.

<br>

---

<br>

# [`lazytables`](https://github.com/ryayoung/lazytables) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="https://pypi.org/project/lazytables/"><img src="https://img.shields.io/pypi/v/lazytables.svg" height="21"/></a>

Lazytables make it easy to manage a large number of data sources in your code. `@lazytables` makes your class act like a database, where your
instance is the namespace, and each attribute is a table.

With a SQL-like syntax for accessing data, you can freely access data sources at your leisure, with peace of mind that the data will only be read on-demand as you need it, and the same data will never be read twice.

Lazytables puts all the power and control in your hands. It has no authority over how data is read or written. In fact, it doesn't even know how your data is read or written.

<br>

---

<br>

# [`scopespace`](https://github.com/ryayoung/scopespace) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="https://pypi.org/project/scopespace/"><img src="https://img.shields.io/pypi/v/scopespace.svg" height="21"/></a>

An experimental new design pattern for working with data in a notebook environment.

`ScopeSpace` is a context manager who's inner block has its own local scope. And when that block ends, the name you assigned to the context manager becomes a namespace, storing all new declarations made within the scoped block.

```py
with ScopeSpace() as bar:
    stuff = 10
    
print(stuff)  # NameError: name 'stuff' is not defined
print(bar.stuff)  # 10
```

```py
x = 5
with ScopeSpace() as foo:
    x = x + 1
    
print(x)  # 5
print(foo.x) # 6
```

<br>

---

<br>

<!-- VB.NET APPLICATION SCREENSHOT -->
<!-- https://user-images.githubusercontent.com/90723578/136726037-5e793725-719e-4475-a341-eea0211097c1.png -->

# [`excelbird`](https://github.com/ryayoung/excelbird) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="https://pypi.org/project/excelbird/"><img src="https://img.shields.io/pypi/v/excelbird.svg" height="21"/></a> &nbsp;&nbsp;&nbsp; <a href="https://github.com/ryayoung/excelbird/actions"> <img src="https://github.com/ryayoung/excelbird/actions/workflows/tests.yaml/badge.svg"/> </a>

### <a href="https://excelbird.readthedocs.io/en/latest/"><img src="https://github.com/ryayoung/icons/blob/main/svg/code.file.blue.svg" height="22"/> &nbsp; Docs</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="https://github.com/ryayoung/excelbird"><img src="https://github.com/ryayoung/icons/blob/main/svg/code.slash.blue.svg" height="20"/> &nbsp; Code</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="https://pypi.org/project/excelbird/"><img src="https://github.com/ryayoung/icons/blob/main/svg/folder.blue.svg" height="22"/> &nbsp; PyPI</a>

> **A front-end framework for Excel that can do magical things.**

**The problem:** With traditional tools, scripting Excel is tedious for two reasons:
1. **Layout**: You must refer to actual cell locations in your code, and tell them each what to do.
2. **Cell References**: The most important feature of a spreadsheet - the ability to see how calculations were made - is not available to you when scripting.

**With excelbird:**
1. Layout and styling is as easy as building an HTML page. You don't have to tell cells where to go.
2. A dataframe library where all calculations are lazily evaluated as formulas and cell references at write time.

<br>

---

<br>

# Geo-Visualization App

### <a href="https://github.com/ryayoung/coloradoplot"><img src="https://github.com/ryayoung/icons/blob/main/svg/code.slash.blue.svg" height="20"/> &nbsp; Code</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="https://colorado-crime.herokuapp.com/"><img src="https://github.com/ryayoung/icons/blob/main/svg/house.blue.svg" height="21"/> &nbsp; Website</a>

> A Python web app for visualizing Colorado geographic data. Nearly 400 variables to choose from, including crime stats, census data, student demographics, viewable by county or by district.

<details>
<summary><b>Tech</b></summary>

- **Web Framework:** Plotly Dash for Python
- **Logic and data structures:** Geopandas dataframes, and pure Python
- **Geocoding:** Google API
- **UI Components:** Mostly Dash Bootstrap components with some Dash Core components, and a lot of custom styling.

</details>

<img width="1000" alt="map" src="https://user-images.githubusercontent.com/90723578/177008249-4d618061-f506-42e8-9e19-1a549b388449.png">

<br>

---

<br>

# [```extend-inplace```](https://github.com/ryayoung/extend-inplace) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="https://pypi.org/project/extend-inplace/"><img src="https://img.shields.io/pypi/v/extend-inplace.svg" height="21"/></a> &nbsp;&nbsp;&nbsp; <a href="https://github.com/ryayoung/extend-inplace/actions"> <img src="https://github.com/ryayoung/extend-inplace/actions/workflows/tests.yaml/badge.svg"/> </a>

### <a href="https://github.com/ryayoung/extend-inplace"><img src="https://github.com/ryayoung/icons/blob/main/svg/code.file.blue.svg" height="22"/> &nbsp; Docs</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="https://pypi.org/project/extend-inplace/"><img src="https://github.com/ryayoung/icons/blob/main/svg/folder.blue.svg" height="22"/> &nbsp; PyPI</a>

> A simple tool to enable an unconventional but sometimes useful coding style. In simple terms, it's a framework for modifying existing classes in an easy, organized, and readable way. See the below examples.

<table>
<tr>
<td colspan="3">On the left is your code. On the right is how it's interpreted at runtime</td>
<tr>
<tr>
<td><img width="350" alt="example3" src="https://user-images.githubusercontent.com/90723578/205125281-4168cbe4-43d0-45e6-9bc7-9d900f22b611.png"></td>
<td><img width="350" alt="example1" src="https://user-images.githubusercontent.com/90723578/205125276-aac7b2bc-5474-4278-be51-9f5640957197.png"></td>
<td><img width="350" alt="example2" src="https://user-images.githubusercontent.com/90723578/205125280-ab887b5f-774b-433c-a227-df37710b51b1.png"></td>
</tr>
</table>

> Elements under `@Extend` and `class _(Extend` get 'moved' to `Something` (they become `None` in global scope and set as attributes on `Something`).

<br>

---

<br>

# [```tsopt```](https://github.com/ryayoung/tsopt) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="https://pypi.org/project/tsopt/"><img src="https://img.shields.io/pypi/v/tsopt.svg" height="21"/></a>

### <a href="https://github.com/ryayoung/tsopt"><img src="https://github.com/ryayoung/icons/blob/main/svg/code.file.blue.svg" height="22"/> &nbsp; Docs</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="https://pypi.org/project/tsopt/"><img src="https://github.com/ryayoung/icons/blob/main/svg/folder.blue.svg" height="22"/> &nbsp; PyPI</a>

> A python package/API for building network flow optimization models in a notebook environment.

- The network's shape and constraint stack is dynamic in every aspect, making experimentation effortless; The user's code will follow the same structure regardless of how the model looks.
- Unlike other implementations, the user can easily constrain upper/lower bounds at _any_ level of granularity (and any location) within the network, to support real-world, complex, edge-case situations, and make quick modification/experimentation easy.
  - Set flow bounds on entire layers, nodes within each layer, or individual edges between nodes.
- Excellent cell outputs when displaying model features in a notebook (Custom display methods are implemented for all model features)

<br>

---

<br>

# [crime-data-engineering](https://github.com/ryayoung/crime-data-engineering)

### <a href="https://github.com/ryayoung/crime-data-engineering"><img src="https://github.com/ryayoung/icons/blob/main/svg/code.file.blue.svg" height="22"/> &nbsp; Code</a>

> An extensive data wrangling, cleaning, and geocoding pipeline to prepare data for the [geo-visualization web app](https://github.com/ryayoung/coloradoplot) highlighted above. Data is extracted from more than a dozen public data sources, cleaned/engineered for analysis and visualization, geocoded, and joined on custom keys. Resulting dataset has ~350 geocoded metrics for each county in Colorado over 8 consecutive years, and ~140 geocoded metrics for each school district.

<br>

---

<br>

# [```chart-tools```](https://github.com/ryayoung/chart-tools) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="https://pypi.org/project/chart-tools/"><img src="https://img.shields.io/pypi/v/chart-tools.svg" height="21"/></a>

### <a href="https://github.com/ryayoung/chart-tools"><img src="https://github.com/ryayoung/icons/blob/main/svg/code.file.blue.svg" height="22"/> &nbsp; Docs</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="https://pypi.org/project/chart-tools/"><img src="https://github.com/ryayoung/icons/blob/main/svg/folder.blue.svg" height="22"/> &nbsp; PyPI</a>

> Python library with pre-configured visualizations, functions building charts rapidly, and an api for exploring, managing, loading, and generating documentation for online tabular datasets.

#### Example: the `superheat()` function
> A much better correlation matrix/heatmap. Marks are sized based on the strength of the correlation, and it offers advanced options such as masking marks below a threshold, excluding variables that correlate on average below a threshold, and, by default, masking duplicate correlations and self-on-self correlations.
```py
# Make an 18x18 inch chart with pre-defined styling, circular marks, grid hidden,
# hiding correlations below 0.1, hiding self-on-self correlations (default),
# and hiding repeated/duplicate correlations from the right side (default)
ct.set_style(18)
ct.superheat(df.corr(), thresh_mask=0.10, grid=False, marker='o');
```
<img width="650" alt="image" src="https://user-images.githubusercontent.com/90723578/167240845-828ddec2-6323-4208-a4de-9e585c27b72e.png">

<br>

---

<br>

# [```py-excel-solver```](https://github.com/ryayoung/py-excel-solver) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="https://pypi.org/project/excel-solver/"><img src="https://img.shields.io/pypi/v/excel-solver.svg" height="21"/></a>

### <a href="https://github.com/ryayoung/py-excel-solver"><img src="https://github.com/ryayoung/icons/blob/main/svg/code.file.blue.svg" height="22"/> &nbsp; Docs</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="https://pypi.org/project/excel-solver/"><img src="https://github.com/ryayoung/icons/blob/main/svg/folder.blue.svg" height="22"/> &nbsp; PyPI</a>

> Simple python package to mimic the interface of Excel's Solver for linear optimization problems. Designed solely for ease of use, requires almost zero python experience to implement, but lacks the flexibility of more developer-oriented optimization tools like [`tsopt`](https://github.com/ryayoung/tsopt), a network flow optimization tool I built.
> 
> Problems are solved in a single line of code: Call `solver()`, passing arguments in a similar format to how you would lay out the problem in Excel. See the example below...

<details>
  <summary><i><b>Example:</b></i></summary>
  
**Problem:** Create a trail mix recipe with the minimum possible cost while meeting nutrition requirements. Each ingredient has a cost and a different arrangement of nutrients. The model is subject to a constraint on the minimum total nutrients of the combined ingredients, and a minimum quantity of each ingredient.

**Excel solution:** (objective value is under "Total" in row 8. Decision quantities are highlighted in row 5.)
![image](https://user-images.githubusercontent.com/90723578/148739017-b8ee6e72-5684-44d3-aaa0-9dc4d0f905eb.png)
  
**Python solution with `excel-solver`:**
```py
import solver
solver.solve(
    problem_type = "min",
    objective_function = [
        4, 5, 3, 7, 6
    ],
    constraints_left = [
        [10,  20,  10,  30,  20],
        [5,   7,   4,   9,   2],
        [1,   4,   10,  2,   1],
        [500, 450, 160, 300, 500],
    ],
    constraints_right = [
        16,
        10,
        15,
        600,
    ],
    constraints_signs = [
        ">=",
        ">=",
        ">=",
        ">=",
    ],
    minimum_for_all=0.1, # replaces lines 15-19 in the excel image above
)
```
**Output:**
```
------------------------------------------------------
MINIMIZE: z = 4a + 5b + 3c + 7d + 6e
------------------------------------------------------
OPTIMAL VALUE:  8.04
------------------------------------------------------
QUANTITIES:
a:  0.44415
b:  0.18091
c:  1.35322
d:  0.1
e:  0.1
------------------------------------------------------
Optimization terminated successfully. (HiGHS Status 7: Optimal)
```

</details>

<br>

---

<br>

# Power BI Dashboard

### <a href="https://github.com/ryayoung/data-warehousing"><img src="https://github.com/ryayoung/icons/blob/main/svg/server.blue.svg" height="22"/> &nbsp; Database Project</a>

> Uses data from the Karve Analytics data warehouse. This is the final part of the Karve project.

<br>(Unmute for narration)<br>

https://user-images.githubusercontent.com/90723578/161363277-efcb2183-78a2-4f59-9d22-1fd34b3818da.mov

<br>

---

<br>

# .NET Forms App

### <a href="https://github.com/ryayoung/karve-forms-app"><img src="https://github.com/ryayoung/icons/blob/main/svg/code.slash.blue.svg" height="20"/> &nbsp; Code</a>

A .NET app to interact with the [Karve OLTP sample database](https://github.com/ryayoung/karve-sample-database) to manage the fictitious business.

<br>(Unmute for narration)<br>

https://user-images.githubusercontent.com/90723578/177630055-e287d2a7-78b6-47c5-8567-7290e597ced9.mp4

<br>

---

<br>

# Simulation: Karve OLTP Sample Database

### <a href="https://github.com/ryayoung/karve-sample-database"><img src="https://github.com/ryayoung/icons/blob/main/svg/code.slash.blue.svg" height="20"/> &nbsp; Code</a>

> A Python script to simulate real business patterns and distributions of customer data to populate the Karve database with sample data. The result is a sample SQL Server database that students can use to practice analytical tasks such as queries or visualizations to discover hidden patterns and trends in the data.

*For example...*

- Rental order volume and return statistics are distributed bimodally, peaking near christmas and spring break.
- Rental operations are valid, such that a ski won't be in the hands of more than one customer at a time, won't be used after it has been damaged critically, will be rented less frequently over consecutive seasons, and always gets returned on time at the end of the season.
- The rate at which skis get damaged, the number of damage records per order, and the frequency of different types of ski damage are distributed based on time of season, the type of rider, and the type of ski.
- All customers are treated as real people. Thus, their key identifiers (name, gender, email, home address) line up with each other, and their body type and rider metrics (height, weight, boot size, ability) are aligned with each other. Those metrics also follow the distributions of real people.

#### Here are a few histograms of the data:

<table>
  <tr>
    <td><img src="https://github.com/ryayoung/data-warehousing/blob/main/KarveAutomation/plots/customer_weights.png" height="250" width="auto"></td>
    <td><img src="https://github.com/ryayoung/data-warehousing/blob/main/KarveAutomation/hist_days_kept.png" height="250" width="auto"></td>
  </tr>
</table>

<br>

---

<br>

# Graphic Design 

### <a href="https://github.com/ryayoung/graphic-design"><img src="https://github.com/ryayoung/icons/blob/main/svg/easel.blue.svg" height="22"/> &nbsp; Full Portfolio</a>

#### Select one...

<table>
  <tr>
    <th><b>Infographic</b></th>
    <th><b>App Prototype</b></th>
  </tr>
  <tr>
    <td><a href="GraphicDesign/Infographic.md/#top"><img src="Buttons/PNG/youtube infographic.png" height="230"/></a></td>
    <td><a href="GraphicDesign/MobileApp.md/#top"><img src="Buttons/PNG/alphanote.png" height="230"/></a></td>
  </tr>
  <tr>
    <th><b>Brand Guide</b></th>
    <th><b>Logo Design</b></th>
  </tr>
  <tr>
    <td><a href="GraphicDesign/BrandGuide.md/#top"><img src="Buttons/PNG/anode.png" height="230"/></a></td>
    <td><a href="GraphicDesign/LogoDesign.md/#top"><img src="Buttons/PNG/more than a word.png" height="230"/></a></td>
  </tr>
</table>

<br>

---

<br>


# Maze generator & solver (Java)

### <a href="https://github.com/ryayoung/java-maze"><img src="https://github.com/ryayoung/icons/blob/main/svg/code.slash.blue.svg" height="20"/> &nbsp; Code</a>

> Randomly generates a unique maze and solves it. Uses pure Java, with custom data structures. As soon as the maze is solved, the path corrects itself to remove dead ends and reveal the shortest path.

https://user-images.githubusercontent.com/90723578/136681997-f5c74bb6-6f57-4d3c-84cc-de1064729ad6.mp4


<br>

---

<br>

# ```vim-annotate-me```

### <a href="https://github.com/ryayoung/vim-annotate-me"><img src="https://github.com/ryayoung/icons/blob/main/svg/code.file.blue.svg" height="20"/> &nbsp; Docs & Install</a>

> A Vim plugin for commenting/uncommenting lines of text, with some additional features. I prefer this over [commentary](https://github.com/tpope/vim-commentary) because it *doesn't* use motions. It instead works like a normal IDE, where a single key mapping toggles one or more lines of text.

**File headers**
- A feature to automatically create headers (your name & today's date) at the top of any new document you create, or any empty document that you open, and comments out that header using correct syntax based on your filetype.
- Lets you toggle the current file's header on/off with a single keypress, without disrupting your code, and without moving your cursor from its relative position.
- As soon as you write/save a file that HAS been modified, the header (if one exists) will be updated with the current date.
- The header format is customizeable, including the format of the current date. If you change the date format in your vimrc, the old dates in your previous files will automatically update with the new format once you save/write to them again.

<br>

---

<br>

# ```vim-run-python```

### <a href="https://github.com/ryayoung/vim-run-python"><img src="https://github.com/ryayoung/icons/blob/main/svg/code.file.blue.svg" height="22"/> &nbsp; Docs & Install</a>

> A vim plugin to run Python code inside Vim, without using a terminal. With a single keypress, the output from your current Python file will be placed in a new buffer (window) at the bottom of your editor.

- **Intelligent Environment Finding**: When you press your key binding, it searches your current directory, and several parent directories, to find a python virtual environment named `env`. If none are found, then your machine's global python kernel will be used.
- Current script gets executed silently, and its output is placed into a new Vim buffer at the bottom of your window.
- This new buffer is dynamically sized, so it's only tall enough to fit the output of your script. Its height is updated every time you execute.

<img width="400" alt="image" src="https://user-images.githubusercontent.com/90723578/162662457-25bc367e-d661-4f91-b105-36babdafb2d5.png">

<br>

---

<br>


# Github Markdown Advanced Tutorial

### <a href="https://github.com/ryayoung/markdown-cheatsheet"><img src="https://github.com/ryayoung/icons/blob/main/svg/mortorboard.blue.svg" height="22"/> &nbsp; See Tutorial</a>

Amazing documentation [like this](https://spacy.io/usage/linguistic-features/) is hard to come by. Often we don't have time to create a dedicated website for our documentation, and must rely on Github. There are plenty of sweet features you can take advantage of in your readme pages with very little effort. For example, did you know you can fold text like this:

<details>
  <summary><i><b>CLICK ME!</b></i></summary>

- I am an inside of an html ```details``` element. See the tutorial above for how to use me!

```python
print("I'm colored with python syntax highlighting, AND I'm encased inside a text folding element :)")
```
</details>
