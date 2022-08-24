
# WAD at CVPR Keynote Notes
> Workshop on Autonomous Driving (WAD), at the Computer Vision and Pattern Recognition Conference (CVPR)

<br>

## TABLE OF CONTENTS

<details>
    <summary> <h3> 2022 </h3> </summary>

#### _KEYNOTES_

| Speaker | Source | Title | Time |
| ------- | ------ | ----- | ---- |
| Alex Kendall | Wayve | [**AV2.0: Learning a Globally Scalable Driving Intelligence**](#kendall2) | 31 |
| Sergey Levine | UC Berkeley | [**From Imitation Learning to Offline RL**](#levine) | 28 |
| Yuning Chai | Cruise | [**Deploying Autonomous Driving: Where are we now and what lies ahead?**](#chai) | 25 |
| Matthew J.-Roberson | CMU | [**History of self-driving, escaping labeling, sensors, simulation**](#roberson) | 23 |
| Raquel Urtasun | Waabi/UofT | [**Waabi simulation; sensors, scenarios, learning**](#urtasun2) | 38 |
| Sanja Fidler | Nvidia/UofT | [**Neural AV Simulation**](#fidler) | 26 |
| Philipp Krähenbühl | UT Austin | [**Why work on autonomy in academia?**](#krahenbuhl) | 29 |
| Ashok Elluswamy | Tesla | [**Occupancy Networks**](#elluswamy) | 35 |

#### _CHALLENGES_

| Title | Source | Time |
| ----- | ------ | ---- |
| [**Argoverse Challenge**](#argoverse3) | Argo AI | 44 |
| [**nuPlan**](#nuplan) | Motional | 5 |
| [**BDD100K**](#bdd100k) | ETH VIS | 22 |
| [**Waymo Open Dataset**](#opendataset2) | Waymo | 40 |


</details>

<details>
    <summary> <h3> 2021 </h3> </summary>

#### _KEYNOTES_

| Speaker | Source | Title | Time |
| ------- | ------ | ----- | ---- |
| Andrej Karpathy | Tesla | [**Vision vs. lidar/HD-map, NN training, hardware**](#karpathy) | 31 |
| Carl Wellington | Aurora | [**Bridging Perception to Motion Planning**](#wellington) | 27 |
| Deva Ramanan | Argo/CMU | [**Perception and Action in the Open World**](#ramanan) | 32 |
| Raquel Urtasun | Waabi/UofT | [**Interpretable Neural Motion Planner**](#urtasun) | 32 |
| Sarah Tariq | Nvidia | [**AV Development at Massive Scale**](#tariq) | 28 |
| Adrien Gaidon | TTI | [**Self-Supervised 3D Vision**](#gaidon) | 22 |
| Alex Kendall | Wayve | [**AV2.0: Reimagining autonomous mobility with embodied intelligence**](#kendall) | 29 |
| Bo Li | UIUC | [**Secure Learning for Autonomous Driving in Adversarial Environments**](#li2) | 28 |

#### _CHALLENGES_

| Title | Source | Time |
| ----- | ------ | ---- |
| [**Argoverse Challenge**](#argoverse2) | Argo AI | 55 |
| [**Waymo Open Dataset**](#opendataset) | Waymo | 1 |

</details>

<details>
    <summary> <h3> 2020 </h3> </summary>

#### _KEYNOTES_

| Speaker | Source | Title | Time |
| ------- | ------ | ----- | ---- |
| Bo Li | UIUC | [**Secure Learning in Adversarial Autonomous Driving Environments**](#li) | 27 |
| Drago Anguelov | Waymo | [**Machine Learning for Autonomous Driving at Scale**](#anguelov) | 35 |


#### _CHALLENGES_

| Title | Source | Time |
| ----- | ------ | ---- |
| [**Argoverse Challenge**](#argoverse) | Argo AI | 28 |

</details>

<br>
<br>



# **2022**
---

### _Keynotes_

### [AV2.0: Learning a Globally Scalable Driving Intelligence](https://www.youtube.com/watch?v=UhDUczF47VI) <a id="kendall2">
<table><tr> <td> <b> Alex Kendall </b> </td><td> Wayve </td><td> 31 min </td> </table></tr>

- .


### [From Imitation Learning to Offline RL](https://www.youtube.com/watch?v=Od9CVqzIgZ8) <a id="levine">
<table><tr> <td> <b> Sergey Levine </b> </td><td> UC Berkeley </td><td> 28 min </td> </table></tr>

- .


### [Deploying Autonomous Driving: Where are we now and what lies ahead?](https://www.youtube.com/watch?v=EJ0hgOc0XLA) <a id="chai">
<table><tr> <td> <b> Yuning Chai </b> </td><td> Cruise </td><td> 25 min </td> </table></tr>

- .


### [History of self-driving, escaping labeling, sensors, simulation](https://www.youtube.com/watch?v=I4QEZxfPUmc) <a id="roberson">
<table><tr> <td> <b> Matthew J.-Roberson </b> </td><td> CMU </td><td> 23 min </td> </table></tr>

- .


### [Waabi simulation; sensors, scenarios, learning](https://www.youtube.com/watch?v=g0uIVWecws4) <a id="urtasun2">
<table><tr> <td> <b> Raquel Urtasun </b> </td><td> Waabi/UofT </td><td> 38 min </td> </table></tr>

- .


### [Neural AV Simulation](https://www.youtube.com/watch?v=K1RvII74zW4) <a id="fidler">
<table><tr> <td> <b> Sanja Fidler </b> </td><td> Nvidia/UofT </td><td> 26 min </td> </table></tr>

- .


### [Why work on autonomy in academia?](https://www.youtube.com/watch?v=Lk_X08NejX0) <a id="krahenbuhl">
<table><tr> <td> <b> Philipp Krähenbühl </b> </td><td> UT Austin </td><td> 29 min </td> </table></tr>

- .


### [Occupancy Networks](https://www.youtube.com/watch?v=jPCV4GKX9Dw) <a id="elluswamy">
<table><tr> <td> <b> Ashok Elluswamy </b> </td><td> Tesla </td><td> 35 min </td> </table></tr>

- Status of Autopilot and FSD Beta as of June, 2022
- Why classical image space is not sufficient; 3D space is needed [3:20](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=200s)
- **_Depth maps_** (old design) versus **_occupancy networks_** (new design)
    - Old design: depth maps (depth on a per-pixel basis) [5:10](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=310s)
        - Predictions are inaccurate at long distances
        - Inconsistent resolution. Nearer objects have much more detail, and farther objects have less detail. This makes it difficult for the planning stack to have good logic around avoiding obstacles
        - It's harder to predict around occlusions
        - More memory intensive
    - New solution: occupancy networks [6:42](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=402s)
        - Volumetric occupancy in 3d space, so it persists through occlusions
        - A single output is produced from the network, so there is no stitching camera feeds together
        - Consistent resolution in relevant driving area
        - Faster, more memory efficient. The entire occupancy network is produced in 10ms, faster than the frame rate of the cameras.
- Occupancy Network - Architecture [9:40](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=580s)
- Why it was a bad idea to have separate networks for dealing with moving and stationary objects
    - Old design: separate networks for moving and stationary objects [11:55](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=715s)
        - Things can slip through the ontology cracks - incorrect classifications can be very dangerous
    - New solution: occupancy network flow. [14:12](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=852s)
        - There is no such thing as a stationary object. Treat all objects as moving objects.
        - Include all objects in a single occupancy network, then predict future occupancy, or _occupancy flow_
- Better handling of occlusions with occupancy networks [18:00](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=1080s)
- Thinking about occupancy networks as an extension to **_neural radiance fields_** [19:33](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=1173s)
    - Car uses calibration and trajectory estimation stacks to produce accurate camera courses across time, and then run NeRF models to produce 3D reconstruction by differentiably rendering images from the 3D state
- Dealing with image artifacts, such as sun glare, dust, and rain [21:20](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=1280s)
    - Use higher-level descriptors instead of RGB values.
    - RGB is super noisy, so adding descriptors on top of RGB protects against the noise.
- Collision avoidance when NOT using autopilot - intervening to prevent crashes [23:45](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=1425s)
    - Currently, autopilot prevents 40 crashes per day due to accelerator misapplications
- Implicit networks for collision avoidance [25:17](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=1517s)
    - Simply making a system "safe" is not enough
    - A good system must be **safe, comfortable, AND reasonably fast**
    - Driving safely is easy if the car can brake hard and drive slow.
    - The challenge of smooth driving while also being safe [27:16](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=1631s)
        - The problem is, you need to predict a crash many seconds in the future so you can brake early.
        - A naive approach (search-based techniques) is far too slow because the search-space is too large.
    - The solution: approximate them with neural networks: **_implicit fields_** [27:54](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=1674s)
        - Produce implicit fields that encode obstacle avoidance
        - Compress the occupancy from previous networks into an MLP that's an implicit representation of whether a collision is avoidable or not from any particular query state
    - Super cool visualization of collision field over time horizon [30:59](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=1811s)



#

### _Challenges_

### [Argoverse Challenge](https://www.youtube.com/watch?v=Z1q9ijuLLvU) <a id="argoverse3">
<table><tr> <td> <b> Argo AI </b> </td><td> 44 min </td> </table></tr>

- .


### [nuPlan](https://www.youtube.com/watch?v=R9w_0Fz19pQ) <a id="nuplan">
<table><tr> <td> <b> Motional </b> </td><td> 5 min </td> </table></tr>

- .


### [BDD100K](https://www.youtube.com/watch?v=13PjjBEgEcM) <a id="bdd100k">
<table><tr> <td> <b> ETH VIS </b> </td><td> 22 min </td> </table></tr>

- .


### [Waymo Open Dataset](https://www.youtube.com/watch?v=G01cfxuJ_ro) <a id="opendataset2">
<table><tr> <td> <b> Waymo </b> </td><td> 40 min </td> </table></tr>

- .


<br>

# 2021
---

### _Keynotes_

### [The vision-only approach, NN training, hardware](https://www.youtube.com/watch?v=g6bOwQdCJrc) <a id="karpathy">
<table><tr> <td> <b> Andrej Karpathy </b> </td><td> Tesla </td><td> 31 min </td> </table></tr>

- .


### [Bridging Perception to Motion Planning](https://www.youtube.com/watch?v=YQ_yar_5Q98) <a id="wellington">
<table><tr> <td> <b> Carl Wellington </b> </td><td> Aurora </td><td> 27 min </td> </table></tr>

- .


### [Perception and Action in the Open World](https://www.youtube.com/watch?v=N-A5qnYXw_U) <a id="ramanan">
<table><tr> <td> <b> Deva Ramanan </b> </td><td> Argo/CMU </td><td> 32 min </td> </table></tr>

- .


### [Interpretable Neural Motion Planner](https://www.youtube.com/watch?v=PSZ2Px9PrHg) <a id="urtasun">
<table><tr> <td> <b> Raquel Urtasun </b> </td><td> Waabi/UofT </td><td> 32 min </td> </table></tr>

- .


### [AV Development at Massive Scale](https://www.youtube.com/watch?v=3WqooCcUpn0) <a id="tariq">
<table><tr> <td> <b> Sarah Tariq </b> </td><td> Nvidia </td><td> 28 min </td> </table></tr>

- .


### [Self-Supervised 3D Vision](https://www.youtube.com/watch?v=YO5fnaRm5L0) <a id="gaidon">
<table><tr> <td> <b> Adrien Gaidon </b> </td><td> TTI </td><td> 22 min </td> </table></tr>

- .


### [AV2.0: Reimagining autonomous mobility with embodied intelligence](https://www.youtube.com/watch?v=Va-F4qtTQ6g) <a id="kendall">
<table><tr> <td> <b> Alex Kendall </b> </td><td> Wayve </td><td> 29 min </td> </table></tr>

- .


### [Secure Learning for Autonomous Driving in Adversarial Environments](https://www.youtube.com/watch?v=X1a4rbddz-s) <a id="li2">
<table><tr> <td> <b> Bo Li </b> </td><td> UIUC </td><td> 28 min </td> </table></tr>

- .


#

### _Challenges_

### [Argoverse Challenge](https://www.youtube.com/watch?v=DM8jWfi69zM) <a id="argoverse2">
<table><tr> <td> <b> Argo AI </b> </td><td> 55 min </td> </table></tr>

- .


### [Waymo Open Dataset](https://www.youtube.com/watch?v=sjXI_FKYw4Y) <a id="opendataset">
<table><tr> <td> <b> Waymo </b> </td><td> 61 min </td> </table></tr>

- .


<br>

# 2020
---

### _Keynotes_

### [Secure Learning in Adversarial Autonomous Driving Environments](https://www.youtube.com/watch?v=0VfBGWnFNuw) <a id="li">
<table><tr> <td> <b> Bo Li </b> </td><td> UIUC </td><td> 27 min </td> </table></tr>

- .


### [Machine Learning for Autonomous Driving at Scale](https://www.youtube.com/watch?v=BV4EXwlb3yo) <a id="anguelov">
<table><tr> <td> <b> Drago Anguelov </b> </td><td> Waymo </td><td> 35 min </td> </table></tr>

- .


#

### _Challenges_

### [Argoverse Challenge](https://www.youtube.com/watch?v=Vcbj_peZT4Q) <a id="argoverse">
<table><tr> <td> <b> Argo AI </b> </td><td> 28 min </td> </table></tr>

- .


<br>
<br>

# General
---


### [Tesla AI Day 2021 Cut](https://www.youtube.com/watch?v=keWEE9FwS9o) <a id="aiday2021">
<table><tr> <td> <b> Andrei Karpathy, Ashok Elluswamy, Ganesh V. </b> </td><td> Tesla Daily </td><td> 20 <b>Aug 2021</b> </td><td> 19 min </td> </table></tr>

- Full Self-Driving [1:01](https://www.youtube.com/watch?v=keWEE9FwS9o&t=61s) - Andrei Karpathy (Sr. Dir. of AI)
- 4D vector labeling [3:24](https://www.youtube.com/watch?v=keWEE9FwS9o&t=204s) - Andrei Karpathy
- Auto-labeling [4:30](https://www.youtube.com/watch?v=keWEE9FwS9o&t=270s) - Ashok Elluswamy (Dir. of Autopilot Software)
- Tracking objects [6:28](https://www.youtube.com/watch?v=keWEE9FwS9o&t=388s) - Ashok Elluswamy
- Tesla simulation [8:15](https://www.youtube.com/watch?v=keWEE9FwS9o&t=495s) - Ashok Elluswamy
- Dojo supercomputer [9:46](https://www.youtube.com/watch?v=keWEE9FwS9o&t=586s) - Milan Kovac (Dir. of Eng. of Autopilot), Ganesh V. (Sr. Dir. Autopilot Hardware)
- Tesla Bot humanoid [16:18](https://www.youtube.com/watch?v=keWEE9FwS9o&t=978s) - Elon Musk

### [Tesla AI Day 2021 Cut (How lane changing works)](https://www.youtube.com/watch?v=W5Eo5EEbt0s) <a id="lanechanging">
<table><tr> <td> <b> Ashok Elluswamy </b> </td><td> CNET Highlights </td><td> 19 <b>Aug 2021</b> </td><td> 6 min </td> </table></tr>