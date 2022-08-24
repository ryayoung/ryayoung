
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
<table><tr> <td> <b> Alex Kendall </b> </td><td> Wayve </td><td> 31 min </td> </tr></table>

- .


### [From Imitation Learning to Offline RL](https://www.youtube.com/watch?v=Od9CVqzIgZ8) <a id="levine">
<table><tr> <td> <b> Sergey Levine </b> </td><td> UC Berkeley </td><td> 28 min </td> </tr></table>

- .


### [Deploying Autonomous Driving: Where are we now and what lies ahead?](https://www.youtube.com/watch?v=EJ0hgOc0XLA) <a id="chai">
<table><tr> <td> <b> Yuning Chai </b> </td><td> Cruise </td><td> 25 min </td> </tr></table>

- .


### [History of self-driving, escaping labeling, sensors, simulation](https://www.youtube.com/watch?v=I4QEZxfPUmc) <a id="roberson">
<table><tr> <td> <b> Matthew J.-Roberson </b> </td><td> CMU </td><td> 23 min </td> </tr></table>

- History of self-driving: The idea is actually very old. AVs were built in the 50s that controlled steering using metal cables embedded in the roadway
- How do we escape paying for labeled datasets to train with? [3:56](https://www.youtube.com/watch?v=I4QEZxfPUmc&t=236s)
- Examples of **perception challenges** - smoke, fog, glare, dark, motion blur [4:54](https://www.youtube.com/watch?v=I4QEZxfPUmc&t=294s)
- Paper by S. R. Manikandasriram, [Failing to Learn: Autonomously Identifying Perception Failures for Self-driving Cars](https://arxiv.org/pdf/1707.00051.pdf)
    - Simple technique: Look for missed-detections in a series of frames across time. [5:30](https://www.youtube.com/watch?v=I4QEZxfPUmc&t=330s)
        - **Stereo inconsistencies** as hypotheses (if left camera sees something, the right camera should also identify it) [7:09](https://www.youtube.com/watch?v=I4QEZxfPUmc&t=429s)
    - Correlate errors with geo-locations. Find places on a map where errors are most common [8:05](https://www.youtube.com/watch?v=I4QEZxfPUmc&t=485s)
- **Thermal cameras** [8:46](https://www.youtube.com/watch?v=I4QEZxfPUmc&t=526s)
    - Cheap versus high quality thermal cameras. How do we make the most of the cheaper, noisier image so we can use thermal imaging at a low cost?
    - Paper by S. R. Manikandasriram, [Pixel-Wise Motion Deblurring of Thermal Videos](https://arxiv.org/pdf/2006.04973.pdf)
- Paper by Ming-Yuan Yu, [Risk Assessment and Planning with Bidirectional Reachability for Autonomous Driving](https://arxiv.org/pdf/1909.08059.pdf)
    - **Understanding risk** [10:58](https://www.youtube.com/watch?v=I4QEZxfPUmc&t=658s)
    - How does it work? Calculate a **forward reachability set** for all vehicles in the scene. [13:28](https://www.youtube.com/watch?v=I4QEZxfPUmc&t=808s)
        - FRS uses all the vehicle's dynamics to determine all places the vehicle could possibly end up in the future.
- Paper by Alexa Carlson, [Modeling camera effects to improve visual learning from synthetic data](https://arxiv.org/pdf/1803.07721.pdf)
    - **Simulation - GTA 5**: Training on GTA 5 data partially works, but the image data is very different from real-world images [15:45](https://www.youtube.com/watch?v=I4QEZxfPUmc&t=945s)
    - Solution: use physics to make simulated data look much more like real data [17:30](https://www.youtube.com/watch?v=I4QEZxfPUmc&t=1050s)
        - Add things like chromatic aberration, blur, exposure issues, etc.
    - Limitations of these simulation techniques [19:40](https://www.youtube.com/watch?v=I4QEZxfPUmc&t=1180s)


### [Waabi simulation; sensors, scenarios, learning](https://www.youtube.com/watch?v=g0uIVWecws4) <a id="urtasun2">
<table><tr> <td> <b> Raquel Urtasun </b> </td><td> Waabi/UofT </td><td> 38 min </td> </tr></table>

- [Waabi](https://waabi.ai/): Taking an AI-first, simulation-centric approach to creating a scalable self-driving solution that can adapt to any hardware.
- Autonomy stack walkthrough: sensors, maps, perception, prediction, planning, control [2:07](https://www.youtube.com/watch?v=g0uIVWecws4&t=127s)
- Why is self-driving so hard? [3:50](https://www.youtube.com/watch?v=g0uIVWecws4&t=230s)
- Waabi's better approach [6:09](https://www.youtube.com/watch?v=g0uIVWecws4&t=369s)
    - Combines the best of existing approaches. It's end-to-end trainable, but also modular and interpretable so we can validate and verify the system
    - End-to-end trainability makes the code more simple, developers more productive, and allows for faster changes
- Existing simulation technology, and why it's problematic [9:05](https://www.youtube.com/watch?v=g0uIVWecws4&t=545s)
    - **Log replay**: just playing previously captured data. This is not good because it's non-reactive. You can't test the consequences of your actions, so it's not a real simulation.
    - **Scenario simulation for motion planning**: Overly simplified scenarios, with near-perfect inputs, so you're only looking at one piece of the software stack, and there's no way you can understand how errors in perception and prediction can actually affect the decisions that your motion planner might make.   
    - **Game engines to generate perception data**: Not scalable, because humans have to create and design these virtual worlds. They also aren't realistic enough.
- The Waabi approach: better simulation, less reliance on real-world testing, better scaling [14:21](https://www.youtube.com/watch?v=g0uIVWecws4&t=861s)
- Video about **Waabi World** simulator [16:26](https://www.youtube.com/watch?v=g0uIVWecws4&t=986s)
- **Waabi World Engine**: closed-loop simulator [20:18](https://www.youtube.com/watch?v=g0uIVWecws4&t=1218s)
- How they reconstruct worlds automatically from data and make it photo-realistic [23:28](https://www.youtube.com/watch?v=g0uIVWecws4&t=1408s)
- **Sensor simulation** examples [24:42](https://www.youtube.com/watch?v=g0uIVWecws4&t=1482s)
- **Scenarios** in Waabi World [28:49](https://www.youtube.com/watch?v=g0uIVWecws4&t=1729s)
    - Adversarial scenarios. Use the evaluator to turn intelligent simulated actors into adversarial ones, to challenge the Waabi driver even further. Basically, simulate bad drivers. [31:45](https://www.youtube.com/watch?v=g0uIVWecws4&t=1905s)
- Use the simulator to let the hardware and software teams work together as a single team [33:06](https://www.youtube.com/watch?v=g0uIVWecws4&t=1986s)
    - This speeds up development dramatically. The typical approach has the hardware team build the platform first, and then the software team builds on top of it. With Waabi, you can test many possible hardware platforms in simulation and select the one that actually performs the best
- **Learning** in **closed-loop** simulation [36:03](https://www.youtube.com/watch?v=g0uIVWecws4&t=2163s)


### [Neural AV Simulation](https://www.youtube.com/watch?v=K1RvII74zW4) <a id="fidler">
<table><tr> <td> <b> Sanja Fidler </b> </td><td> Nvidia/UofT </td><td> 26 min </td> </tr></table>

- .


### [Why work on autonomy in academia?](https://www.youtube.com/watch?v=Lk_X08NejX0) <a id="krahenbuhl">
<table><tr> <td> <b> Philipp Krähenbühl </b> </td><td> UT Austin </td><td> 29 min </td> </tr></table>

- Excuses for not working on autonomy in academia [1:25](https://www.youtube.com/watch?v=Lk_X08NejX0&t=85s)
    - a. Autonomy is almost solved, b. I don't own a test vehicle, c. not enough resources
    - History of autonomy in 20s, 50s, and 80s
- **Grad students**: The one thing academia has that the industry doesn't [11:12](https://www.youtube.com/watch?v=Lk_X08NejX0&t=672s)
    - Grad students motivated to solve problems by making progress on small ideas, where they might not make huge progress right away
- Why you *should* work on autonomy [12:10](https://www.youtube.com/watch?v=Lk_X08NejX0&t=730s)
    - Challenging, unsolved, important, potential for high impact, etc.
- The **problem with lidar** [14:20](https://www.youtube.com/watch?v=Lk_X08NejX0&t=860s)
    - Very sparse. 10-100x fewer measurements than color cameras, and it gets worse for objects that are farther away
    - Better lidar sensors are very expensive
- Can we use color cameras to do the work of lidar? [15:27](https://www.youtube.com/watch?v=Lk_X08NejX0&t=927s)
    - **Cross-view transformers**
- **Perception challenges**: tracking reasoning around occlusions [16:53](https://www.youtube.com/watch?v=Lk_X08NejX0&t=1013s)
- **Planning and Control**: why scoring trajectories is hard, and deep learning is a better solution [17:59](https://www.youtube.com/watch?v=Lk_X08NejX0&t=1079s)
- **Imitation learning** versus **reinforcement learning**
    - Why **imitation learning** is not good enough [20:15](https://www.youtube.com/watch?v=Lk_X08NejX0&t=1215s)
        - How do you recover from mistakes?
        - We don't have enough data on risky behaviors or bad driving, crashes, etc.
        - Maybe we could learn by imitation by observing surrounding vehicles?
            - Still not good enough because it does not explore what else we could have done if we were driving differently
    - Use **reinforcement learning** instead. How to use this without crashing all the time? [23:13](https://www.youtube.com/watch?v=Lk_X08NejX0&t=1393s)
        - The **world on rails** assumption: ego can react to environment, but environment cannot react to ego
        - Evaluate classical reinforcement learning algorithms in a tabular form on offline recorded data   
        - This lets us use a reinforcement learning objective on data that was collected just for imitation
- Summary and questions [24:54](https://www.youtube.com/watch?v=Lk_X08NejX0&t=1494s)


### [Occupancy Networks](https://www.youtube.com/watch?v=jPCV4GKX9Dw) <a id="elluswamy">
<table><tr> <td> <b> Ashok Elluswamy </b> </td><td> Tesla </td><td> 35 min </td> </tr></table>

- Status of Autopilot and FSD Beta as of June, 2022
- Why classical image space is not sufficient; 3D space is needed [3:20](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=200s)
- **Depth maps** (old design) versus **occupancy networks** (new design)
    - *Old design*: depth maps (depth on a per-pixel basis) [5:10](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=310s)
        - Predictions are inaccurate at long distances
        - Inconsistent resolution. Nearer objects have much more detail, and farther objects have less detail. This makes it difficult for the planning stack to have good logic around avoiding obstacles
        - It's harder to predict around occlusions
        - More memory intensive
    - *New solution*: occupancy networks [6:42](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=402s)
        - Volumetric occupancy in 3d space, so it persists through occlusions
        - A single output is produced from the network, so there is no stitching camera feeds together
        - Consistent resolution in relevant driving area
        - Faster, more memory efficient. The entire occupancy network is produced in 10ms, faster than the frame rate of the cameras.
- **Occupancy Network - Architecture** [9:40](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=580s)
- Why it was a bad idea to have separate networks for dealing with moving and stationary objects
    - *Old design*: separate networks for moving and stationary objects [11:55](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=715s)
        - Things can slip through the ontology cracks - incorrect classifications can be very dangerous
    - *New solution*: occupancy network flow. [14:12](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=852s)
        - There is no such thing as a stationary object. Treat all objects as moving objects.
        - Include all objects in a single occupancy network, then predict future occupancy, or _occupancy flow_
- Better **handling of occlusions** with occupancy networks [18:00](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=1080s)
- Thinking about occupancy networks as an extension to **neural radiance fields** [19:33](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=1173s)
    - Car uses calibration and trajectory estimation stacks to produce accurate camera courses across time, and then run NeRF models to produce 3D reconstruction by differentiably rendering images from the 3D state
- Dealing with **image artifacts**, such as sun glare, dust, and rain [21:20](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=1280s)
    - Use higher-level descriptors instead of RGB values.
    - RGB is super noisy, so adding descriptors on top of RGB protects against the noise.
- **Collision avoidance** when NOT using autopilot - intervening to prevent crashes [23:45](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=1425s)
    - Currently, autopilot prevents 40 crashes per day due to accelerator misapplications
- **Implicit networks** for collision avoidance [25:17](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=1517s)
    - Simply making a system "safe" is not enough
    - A good system must be **safe, comfortable, AND reasonably fast**
    - Driving safely is easy if the car can brake hard and drive slow.
    - The **challenge of smooth driving** while also being safe [27:16](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=1631s)
        - The problem is, you need to predict a crash many seconds in the future so you can brake early.
        - A naive approach (search-based techniques) is far too slow because the search-space is too large.
    - The solution: approximate them with neural networks: **implicit fields** [27:54](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=1674s)
        - Produce implicit fields that encode obstacle avoidance
        - Compress the occupancy from previous networks into an MLP that's an implicit representation of whether a collision is avoidable or not from any particular query state
    - Super cool visualization of **collision field** over time horizon [30:59](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=1811s)


#

### _Challenges_

### [Argoverse Challenge](https://www.youtube.com/watch?v=Z1q9ijuLLvU) <a id="argoverse3">
<table><tr> <td> <b> Argo AI </b> </td><td> 44 min </td> </tr> </table>

<table><tr>
<td> <b> Speakers: </b> </td> <td> James Hays </td><td> Benjamin Wilson </td><td> Jhony Pontes </td><td> William Qi </td>
</tr></table>

- **Argoverse 2**: Four new datasets:
    1. *Sensor*: improved diversity, longer range
    2. *Lidar*: unlabeled, but include HD maps
    3. *Motion Forecasting*: predict what others will do.
        - Denser environments, non-vehicle actors, longer forecasting horizon
    4. *Map Change*: the FIRST of its kind
        - Given image sensor data alongside HD map data, train networks to determine whether they match.
1. **3D Object Detection with AV2 Sensor** [5:42](https://www.youtube.com/watch?v=Z1q9ijuLLvU&t=342s)
    - Evaluation metrics [7:42](https://www.youtube.com/watch?v=Z1q9ijuLLvU&t=462s)
        - Existing: avg precision, avg translation error, avg scaling error, avg orientation error
        - New: **Composite Detection Score**
    - 1st Place winner: Jin Fang et al [8:29](https://www.youtube.com/watch?v=Z1q9ijuLLvU&t=509s)
        - Video demo of qualitative results [12:30](https://www.youtube.com/watch?v=Z1q9ijuLLvU&t=750s)
2. **Stereo Depth Estimation with AV1** [14:54](https://www.youtube.com/watch?v=Z1q9ijuLLvU&t=894s)
    - Uses **Argoverse 1 3D Tracking** dataset
        - Over 6,000 high-res stereo image pairs
        - Lidar range up to 200 m
    - This year, **emphasis on real-time performance**. Depth estimates must be 200 ms or less
    - Evaluation metrics, leaderboard [18:06](https://www.youtube.com/watch?v=Z1q9ijuLLvU&t=1086s)
    - **Winners** [21:50](https://www.youtube.com/watch?v=Z1q9ijuLLvU&t=1310s)
        - 1st Place: **GMStereo**, by Haofei Xu et al
        - Honorable mention: **MSCLab** by Bangunharcana et al
        - Honorable mention: **LRM** by Rosero & Osorio
    - Visual results/examples [28:20](https://www.youtube.com/watch?v=Z1q9ijuLLvU&t=1700s)
3. **Motion Forecasting with AV2** [33:13](https://www.youtube.com/watch?v=Z1q9ijuLLvU&t=1993s)
    - Evaluation metrics [34:56](https://www.youtube.com/watch?v=Z1q9ijuLLvU&t=2096s)
    - What's new? [35:51](https://www.youtube.com/watch?v=Z1q9ijuLLvU&t=2151s)
        - Doubled forecast horizon from 3s to 6s
        - Increased size of object taxonomy from 1 class to 10
        - Triple the cities, from 2 to 6
    - **Winners** [37:11](https://www.youtube.com/watch?v=Z1q9ijuLLvU&t=2231s)
        - 1st Place: **OPPred**, by Chen Zhang et al [38:22](https://www.youtube.com/watch?v=Z1q9ijuLLvU&t=2302s)
        - Honorable mention: **QML** by Tong Su et al [39:43](https://www.youtube.com/watch?v=Z1q9ijuLLvU&t=2383s)
        - Honorable mention: **GANet** by Mingkun Wang et al [40:00](https://www.youtube.com/watch?v=Z1q9ijuLLvU&t=2400s)
- AV1 vs. AV2: Why AV2 is harder than AV1 [40:30](https://www.youtube.com/watch?v=Z1q9ijuLLvU&t=2430s)


### [nuPlan](https://www.youtube.com/watch?v=R9w_0Fz19pQ) <a id="nuplan">
<table><tr> <td> <b> Motional </b> </td> <td> Juraj Kabzan </td> <td> 5 min </td> </tr></table>

- nuPlan: "The world's first benchmark for autonomous vehicle planning"
- 1300 hour dataset from 4 cities
- Uses real-world sensor data
- Closed-loop simulation evaluation
- **Scenario mining**
    - Unprotected cross turns, dense vehicle interactions, jaywalkers, pickup/dropoff areas
- **Types of planning challenges**
    - Log replay: open-loop ego, open-loop agents
    - Simulation, non-reactive agents: closed-loop ego, open-loop agents
    - Simulation, reactive agents: closed-loop ego, closed-loop agents
- **Timeline:** challenge starts in August, results presented in NeurIPS 2022 in December


### [BDD100K](https://www.youtube.com/watch?v=13PjjBEgEcM) <a id="bdd100k">
<table><tr> <td> <b> ETH VIS </b> </td><td> 22 min </td> </tr></table>

<table>
<tr> <td> <b> Hosts: </b> </td> <td colspan="2"> Tobias Fischer </td> </tr>
<tr> <td> <b> Presenters: </b> </td> <td> Kanokphan Lertniphonphan </td><td> Xiaolin Song </td> </tr>
</table>

- About **BDD100K**:
    - 100,000 dashcam videos (40s)
    - Broad geographic distribution
    - Rich annotations, and scene variation
    - How they are expanding the dataset, + video example [2:12](https://www.youtube.com/watch?v=13PjjBEgEcM&t=132s)
1. **Multiple Object Tracking (MOT)**: 1st Place: **Lenovo Research**: Carl Huang et al [5:11](https://www.youtube.com/watch?v=13PjjBEgEcM&t=311s)
    - Framework [6:39](https://www.youtube.com/watch?v=13PjjBEgEcM&t=399s)
    - Object Detection [7:04](https://www.youtube.com/watch?v=13PjjBEgEcM&t=424s)
    - Data Imbalance [7:45](https://www.youtube.com/watch?v=13PjjBEgEcM&t=465s)
    - Tracking [8:36](https://www.youtube.com/watch?v=13PjjBEgEcM&t=516s)
    - Re-ID [9:24](https://www.youtube.com/watch?v=13PjjBEgEcM&t=564s)
    - Experimental setting and results [11:20](https://www.youtube.com/watch?v=13PjjBEgEcM&t=680s)
2. **Multiple Object Tracking and Segmentation (MOTS)**: 1st Place: **Huawei Noah's Ark Lab**: Xiaolin Song et al [13:48](https://www.youtube.com/watch?v=13PjjBEgEcM&t=828s)
    - Backbone, Detection head [15:38](https://www.youtube.com/watch?v=13PjjBEgEcM&t=938s)
    - Multi-stage mask fusion [16:39](https://www.youtube.com/watch?v=13PjjBEgEcM&t=999s)
    - Spatial mask refinement [17:23](https://www.youtube.com/watch?v=13PjjBEgEcM&t=1043s)
    - Temporal alignment [17:48](https://www.youtube.com/watch?v=13PjjBEgEcM&t=1068s)
    - Results [18:07](https://www.youtube.com/watch?v=13PjjBEgEcM&t=1087s)
    - Visualization [20:09](https://www.youtube.com/watch?v=13PjjBEgEcM&t=1209s)


### [Waymo Open Dataset](https://www.youtube.com/watch?v=G01cfxuJ_ro) <a id="opendataset2">
<table><tr> <td> <b> Waymo </b> </td><td> 40 min </td> </tr></table>

<table>
<tr> <td> <b> Hosts: </b> </td><td> Zoey Yang </td><td> Vincent Casser </td><td> Wei-Chih (Wayne) Hung </td><td> Charles R. Qi </td><td> Scott Ettinger </td><td> Reza Mahjourian </td> </tr>
<tr> <td> <b> Presenters: </b> </td><td> Zhiqi Li </td><td> Jiale Li </td><td> Zixiang Zhou </td><td> Shaoshuai Shi </td><td> Dmytro Poplavskiy </td><td> Yihan Hu </td> </tr>
</table>

- Timeline and datasets
    - **v1.3 Perception Dataset** [2:13](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=133s)
    - **v1.4.0 Perception Dataset** (new) [2:57](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=177s)
    - **Block-NeRF Dataset** (new) [4:20](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=260s)
- Challenge summary [5:25](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=325s)
1. **3D Camera-only Detection** [7:42](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=462s)
    - 1st Place: **Shanghai AI Laboratory**: Zhiqi Li et al [9:59](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=599s)
        - Framework [10:28](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=628s)
        - Temporal Sequence [10:48](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=648s)
        - Further Improvements [11:13](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=673s)
        - Results [13:54](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=834s)
        - Demo [14:10](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=850s)
2. **3D Semantic Segmentation** [14:51](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=891s)
    - 2nd Place: **SegNet3D**: Jiale Li et al [16:30](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=990s)
        - Method [16:49](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=1009s)
        - Experiment and Results [19:07](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=1147s)
    - 1st Place: **LidarMultiNet**: Zixiang Zhou et al [19:54](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=1194s)
        - Single network for 3D semantic seg., obj. detection, panoptic seg. [20:56](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=1256s)
        - Voxel and 3D Sparse Conv* based Encoder and Decoder Architecture [21:06](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=1266s)
        - Global Context Pooling (GCP) [21:20](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=1280s)
        - Auxiliary heads are added to the 2D branch [21:53](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=1313s)
        - 2nd Stage Refinement [22:08](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=1328s)
        - Leaderboard [22:38](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=1358s)
3. **Motion Prediction** [23:08](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=1388s)
    - 1st Place: **MTRA**: Shaoshuai Shi et al [25:35](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=1535s)
        - Our method: Motion Transformer, Encoder for context Encoding [27:00](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=1620s)
        - Transformer Decoder for Multimodal Motion Prediction [27:52](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=1672s)
        - Model Ensemble, Experiment results (leaderboard) [29:37](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=1777s)
4. **Occupancy and Flow Prediction** [30:50](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=1850s)
    - 1st Place: **Look Around**: Dmytro Poplavskiy [33:12](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=1992s)
        - What to improve: **Input encoding, Loss function, Model** [33:45](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=2025s)
        - Flow Warp Block [34:32](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=2072s)
        - Flow visualization [35:47](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=2147s)
    - Honorable Mention: **HOPE**: Yihan Hu et al [36:26](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=2186s)
        - Encoder [37:52](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=2272s)
        - Aggregator [38:09](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=2289s)
        - Decoder [38:27](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=2307s)
        - Loss [38:54](https://www.youtube.com/watch?v=G01cfxuJ_ro&t=2334s)


<br>

# 2021
---

### _Keynotes_

### [The vision-only approach, NN training, hardware](https://www.youtube.com/watch?v=g6bOwQdCJrc) <a id="karpathy">
<table><tr> <td> <b> Andrej Karpathy </b> </td><td> Tesla </td><td> 31 min </td> </tr></table>

- Value currently provided with **Autopilot**: AEB, PMM, traffic control warning, PMM [2:17](https://www.youtube.com/watch?v=g6bOwQdCJrc&t=137s)
- **FSD Beta** drive with zero interventions [3:50](https://www.youtube.com/watch?v=g6bOwQdCJrc&t=230s)
- Vision vs. Lidar + HD map approach. Only vision is scalable. [4:59](https://www.youtube.com/watch?v=g6bOwQdCJrc&t=299s)
    - Vision has gotten so good they have removed radar
- The challenge of using vision only [9:50](https://www.youtube.com/watch?v=g6bOwQdCJrc&t=590s)
    - How can we use neural networks to accurately measure depth, distance, velocity, etc. of objects
- What kind of data is needed to train a good neural network? [11:15](https://www.youtube.com/watch?v=g6bOwQdCJrc&t=675s)
- How **auto-labeling** works. [12:10](https://www.youtube.com/watch?v=g6bOwQdCJrc&t=730s)
    - Examples of tricky labeling scenarios [13:49](https://www.youtube.com/watch?v=g6bOwQdCJrc&t=829s)
- Triggers we use to source data from customer feed for use in training [14:51](https://www.youtube.com/watch?v=g6bOwQdCJrc&t=891s)
    - Defined **221 triggers**, such as bounding box jitter, radar vision mismatch, etc.
    - The triggers let us filter and organize customer data when certain events occur
- How **shadow mode** is used for training new networks [16:00](https://www.youtube.com/watch?v=g6bOwQdCJrc&t=960s)
    - Safely train a new neural network to prevent casualties
    - New network runs in the background while driving, making predictions, and comparing them to the real data from the network currently in use
    - When the new network in shadow mode makes an error or inaccurate prediction, the driving event data is recorded and used later for training or unit tests
    - Stats for **final dataset**, first release [16:54](https://www.youtube.com/watch?v=g6bOwQdCJrc&t=1014s)
- Diagram of **neural net architecture** [17:21](https://www.youtube.com/watch?v=g6bOwQdCJrc&t=1041s)
- In-house supercomputer (PRE-Dojo) [19:27](https://www.youtube.com/watch?v=g6bOwQdCJrc&t=1167s)
- FSD driving chip, and the benefits of vertical integration [21:30](https://www.youtube.com/watch?v=g6bOwQdCJrc&t=1290s)
- Results with new stack and depth/velocity predictions. Smoother driving
    - Very harsh braking [22:43](https://www.youtube.com/watch?v=g6bOwQdCJrc&t=1363s)
    - False slowdowns under bridges [24:24](https://www.youtube.com/watch?v=g6bOwQdCJrc&t=1464s)
    - High speed stationary approach [26:04](https://www.youtube.com/watch?v=g6bOwQdCJrc&t=1564s)
- Release and Validation: testing, simulation, etc. [27:10](https://www.youtube.com/watch?v=g6bOwQdCJrc&t=1630s)
- More about auto-labeling [28:49](https://www.youtube.com/watch?v=g6bOwQdCJrc&t=1729s)




### [Bridging Perception to Motion Planning](https://www.youtube.com/watch?v=YQ_yar_5Q98) <a id="wellington">
<table><tr> <td> <b> Carl Wellington </b> </td><td> Aurora </td><td> 27 min </td> </tr></table>

- .


### [Perception and Action in the Open World](https://www.youtube.com/watch?v=N-A5qnYXw_U) <a id="ramanan">
<table><tr> <td> <b> Deva Ramanan </b> </td><td> Argo/CMU </td><td> 32 min </td> </tr></table>

- .


### [Interpretable Neural Motion Planner](https://www.youtube.com/watch?v=PSZ2Px9PrHg) <a id="urtasun">
<table><tr> <td> <b> Raquel Urtasun </b> </td><td> Waabi/UofT </td><td> 32 min </td> </tr></table>

- .


### [AV Development at Massive Scale](https://www.youtube.com/watch?v=3WqooCcUpn0) <a id="tariq">
<table><tr> <td> <b> Sarah Tariq </b> </td><td> Nvidia </td><td> 28 min </td> </tr></table>

- .


### [Self-Supervised 3D Vision](https://www.youtube.com/watch?v=YO5fnaRm5L0) <a id="gaidon">
<table><tr> <td> <b> Adrien Gaidon </b> </td><td> TTI </td><td> 22 min </td> </tr></table>

- .


### [AV2.0: Reimagining autonomous mobility with embodied intelligence](https://www.youtube.com/watch?v=Va-F4qtTQ6g) <a id="kendall">
<table><tr> <td> <b> Alex Kendall </b> </td><td> Wayve </td><td> 29 min </td> </tr></table>

- .


### [Secure Learning for Autonomous Driving in Adversarial Environments](https://www.youtube.com/watch?v=X1a4rbddz-s) <a id="li2">
<table><tr> <td> <b> Bo Li </b> </td><td> UIUC </td><td> 28 min </td> </tr></table>

- .


#

### _Challenges_

### [Argoverse Challenge](https://www.youtube.com/watch?v=DM8jWfi69zM) <a id="argoverse2">
<table><tr> <td> <b> Argo AI </b> </td><td> 55 min </td> </tr></table>

<table>
<tr> <td> <b> Hosts: </b> </td><td> James Hays </td><td> Jhony Kaesemodel Pontes </td><td> Jagjeet Singh </td><td> Martin Li </td> </tr>
<tr> <td> <b> Presenters: </b> </td><td> Fang Da </td><td> Songyang Zhang </td><td> Anurag Ghosh </td> </tr>
</table>

- **What is Argoverse?**
    - Two datasets: **3D Tracking**, and **Motion Forecasting**
- **Stereo Challenge** [2:11](https://www.youtube.com/watch?v=DM8jWfi69zM&t=131s)
    - **DATASET:** Argoverse 3D Tracking v1.1
    - Comparison of winners and baseline [6:41](https://www.youtube.com/watch?v=DM8jWfi69zM&t=401s)
    - Evaluation Metrics [10:51](https://www.youtube.com/watch?v=DM8jWfi69zM&t=651s)
    - Visual comparison of methods [12:38](https://www.youtube.com/watch?v=DM8jWfi69zM&t=758s)
- **Motion Forecasting Challenge** [19:45](https://www.youtube.com/watch?v=DM8jWfi69zM&t=1185s)
    - Evaluation Metrics [20:41](https://www.youtube.com/watch?v=DM8jWfi69zM&t=1241s)
    - Comparison of winners and baseline [22:32](https://www.youtube.com/watch?v=DM8jWfi69zM&t=1352s)
    - 1st Place: **Team QCraft Blue**: Fang Da, et al [23:23](https://www.youtube.com/watch?v=DM8jWfi69zM&t=1403s)
        - Title: *HD Map Encoding with Long-Range Heterogeneous Graph Attention*
        - Prediction Framework [24:55](https://www.youtube.com/watch?v=DM8jWfi69zM&t=1495s)
    - Honorable Mention: **HOME**: Thomas Gilles et al [25:41](https://www.youtube.com/watch?v=DM8jWfi69zM&t=1541s)
        - **HOME**: Heatmap Output for Future Motion Estimation
        - NN Architecture [26:27](https://www.youtube.com/watch?v=DM8jWfi69zM&t=1587s)
        - Target Sampling [26:51](https://www.youtube.com/watch?v=DM8jWfi69zM&t=1611s)
        - Model Ensembling [27:03](https://www.youtube.com/watch?v=DM8jWfi69zM&t=1623s)
    - Honorable Mention: **HIKVISION Research Institute**: Jingni Yuan et al [27:29](https://www.youtube.com/watch?v=DM8jWfi69zM&t=1649s)
        - Title: *Multimodal trajectory forecasting based on discrete heat map*
    - Other Team: **Team Poly**: Balakrishnan Varadarajan, from Waymo [28:06](https://www.youtube.com/watch?v=DM8jWfi69zM&t=1686s)
        - Solution name: **MultiPath++**
        - Optimizing the Brier minFDE via ensembling [28:42](https://www.youtube.com/watch?v=DM8jWfi69zM&t=1722s)
    - Analyzing Performance on Challenging Scenarios [28:58](https://www.youtube.com/watch?v=DM8jWfi69zM&t=1738s)
        - Unanticipated turn
        - Common failures in past winners [30:10](https://www.youtube.com/watch?v=DM8jWfi69zM&t=1810s)
        - Extreme velocity changes [30:48](https://www.youtube.com/watch?v=DM8jWfi69zM&t=1848s)
        - Lane changes [31:21](https://www.youtube.com/watch?v=DM8jWfi69zM&t=1881s)
    - Takeaways from top 5 methods [32:25](https://www.youtube.com/watch?v=DM8jWfi69zM&t=1945s)
- **Streaming Perception Challenge** [34:50](https://www.youtube.com/watch?v=DM8jWfi69zM&t=2090s)
    - Streaming Evaluation [36:44](https://www.youtube.com/watch?v=DM8jWfi69zM&t=2204s)
    - Predictive Vision [37:35](https://www.youtube.com/watch?v=DM8jWfi69zM&t=2255s)
    - Hardware-in-the-loop Evaluation [39:09](https://www.youtube.com/watch?v=DM8jWfi69zM&t=2349s)
    - DATASET: **Argoverse 1.1** + 2D bounding box annotations (1.3m) [40:07](https://www.youtube.com/watch?v=DM8jWfi69zM&t=2407s)
    - Winners & Awards [41:32](https://www.youtube.com/watch?v=DM8jWfi69zM&t=2492s)
    - Interesting technical observations from winners [42:29](https://www.youtube.com/watch?v=DM8jWfi69zM&t=2549s)
    - 1st Place (detection-only AND full-stack tracks): **Base Det**: Songyang Zhang et al [43:44](https://www.youtube.com/watch?v=DM8jWfi69zM&t=2624s)
        - Which pipeline? R-CNN vs. YOLO [44:55](https://www.youtube.com/watch?v=DM8jWfi69zM&t=2695s)
        - Model Structure (YOLO X) [45:20](https://www.youtube.com/watch?v=DM8jWfi69zM&t=2720s)
        - Learning Strategy, and Inference [45:53](https://www.youtube.com/watch?v=DM8jWfi69zM&t=2753s)
        - Results (Off-line AP) [46:25](https://www.youtube.com/watch?v=DM8jWfi69zM&t=2785s)
    - Honorable Mention (detection-only track): **Chanakya**: Anurag Ghosh et al [47:03](https://www.youtube.com/watch?v=DM8jWfi69zM&t=2823s)
        - Title: *Adaptive Streaming Perception via Reinforcement Learning*
        - Trade-off decisions [47:44](https://www.youtube.com/watch?v=DM8jWfi69zM&t=2864s)
        - Our approach: using RL to figure out tradeoffs automatically [48:12](https://www.youtube.com/watch?v=DM8jWfi69zM&t=2892s)
        - Results [48:55](https://www.youtube.com/watch?v=DM8jWfi69zM&t=2935s)
- Argoverse 1.1 vs 2.0 [50:40](https://www.youtube.com/watch?v=DM8jWfi69zM&t=3040s)


### [Waymo Open Dataset](https://www.youtube.com/watch?v=sjXI_FKYw4Y) <a id="opendataset">
<table><tr> <td> <b> Waymo </b> </td><td> 61 min </td> </tr></table>

<table>
<tr> <td> <b> Hosts: </b> </td><td colspan="5"> Zoey Yang </td> </tr>
<tr> <td> <b> Presenters: </b> </td><td> Qiang Liu </td><td> Fenfen Wang </td><td> Hang Zhao </td><td> Xiaoyu Mo </td><td> David Wu </td> </tr>
</table>

- **Datasets**
    - About Waymo Open Dataset
    - Perception dataset [1:41](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=101s)
    - Motion dataset [1:57](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=117s)
- **Challenges Overview**
    - **Real-time 3D Detection Challenge** [3:44](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=224s)
    - **Real-time 2D Detection Challenge** [5:32](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=332s)
    - **Motion Prediction Challenge** [6:49](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=409s)
    - **Interaction Prediction Challenge** [7:56](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=476s)
- 1st Place (3D Detection): **AFDetV2**: Yihan Hu et al [10:04](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=604s)
    - Point Cloud Voxelization [11:10](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=670s)
    - 3D Feature Extractor [11:57](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=717s)
    - Region Proposal Network [12:40](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=760s)
    - Anchor-free Detection Head [13:20](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=800s)
    - Loss [14:51](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=891s)
    - Point Cloud Densification [15:11](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=911s)
    - Data Augmentation [15:34](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=934s)
    - Stochastic Weight Averaging [16:03](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=963s)
    - Improvements on Latency [16:39](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=999s)
    - Results [17:45](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=1065s)
- 1st Place (2D Detection): **LeapMotor_Det**: Fenfen Wang et al [21:41](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=1301s)
    - One-stage quick verification [22:46](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=1366s)
    - One-stage detector [25:28](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=1528s)
    - Two-stage detector [26:10](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=1570s)
- 1st Place (Motion Prediction): **TsinghuaMARS-DenseTNT**: Junru Gu et al [30:44](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=1844s)
    - Motion Prediction model Paradigms [31:26](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=1886s)
    - Goal-based Prediction Pipeline [32:20](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=1940s)
    - Disadvantages of sparse anchors [33:35](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=2015s)
    - DenseTNT and its architecture [34:37](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=2077s)
    - Results on Argoverse Motion Forecasting Benchmark [37:17](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=2237s)
    - How to apply to apply DenseTNT to long-term prediction [37:58](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=2278s)
    - Results on Waymo Open Dataset Motion Prediction Challenge [39:04](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=2344s)
    - Visualization [40:10](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=2410s)
- 1st Place (Interaction Prediction): **HeatIRm4**: Xiaoyu Mo et al [42:36](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=2556s)
    - Title: *(HEAT): Multi-Modal Interaction Prediction Using Heterogeneous Edge-Enhanced Graph Attention Network*
    - Data Processing [43:47](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=2627s)
    - Method: HEAT [45:01](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=2701s)
    - Model Architecture [46:38](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=2798s)
    - Results/evaluation [50:13](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=3013s)
    - Visualization [50:33](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=3033s)
- Special Guest: **AIR^2**, David Wu [51:10](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=3070s)
    - Title: *AIR^2 for Interaction Prediction*
    - Motion Prediction in a Nutshell [52:08](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=3128s)
    - Interaction Prediction in a Nutshell [53:02](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=3182s)
    - AIR for Motion Prediction [55:24](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=3324s)
    - AIR Model Architecture [56:55](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=3415s)
    - AIR^2 Model Architecture [57:46](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=3466s)
    - Input Representations [58:03](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=3483s)
    - Results & Conclusion [60:18](https://www.youtube.com/watch?v=sjXI_FKYw4Y&t=3618s)


<br>

# 2020
---

### _Keynotes_

### [Secure Learning in Adversarial Autonomous Driving Environments](https://www.youtube.com/watch?v=0VfBGWnFNuw) <a id="li">
<table><tr> <td> <b> Bo Li </b> </td><td> UIUC </td><td> 27 min </td> </tr></table>

- .


### [Machine Learning for Autonomous Driving at Scale](https://www.youtube.com/watch?v=BV4EXwlb3yo) <a id="anguelov">
<table><tr> <td> <b> Drago Anguelov </b> </td><td> Waymo </td><td> 35 min </td> </tr></table>

- .


#

### _Challenges_

### [Argoverse Challenge](https://www.youtube.com/watch?v=Vcbj_peZT4Q) <a id="argoverse">
<table><tr> <td> <b> Argo AI </b> </td><td> James Hays </td><td> 28 min </td> </tr></table>

- .


<br>
<br>

# General
---


### [Tesla AI Day 2021 Cut](https://www.youtube.com/watch?v=keWEE9FwS9o) <a id="aiday2021">
<table><tr> <td> <b> Andrei Karpathy, Ashok Elluswamy, Ganesh V. </b> </td><td> Tesla Daily </td><td> 20 <b>Aug 2021</b> </td><td> 19 min </td> </tr></table>

- Full Self-Driving [1:01](https://www.youtube.com/watch?v=keWEE9FwS9o&t=61s) - Andrei Karpathy (Sr. Dir. of AI)
- 4D vector labeling [3:24](https://www.youtube.com/watch?v=keWEE9FwS9o&t=204s) - Andrei Karpathy
- Auto-labeling [4:30](https://www.youtube.com/watch?v=keWEE9FwS9o&t=270s) - Ashok Elluswamy (Dir. of Autopilot Software)
- Tracking objects [6:28](https://www.youtube.com/watch?v=keWEE9FwS9o&t=388s) - Ashok Elluswamy
- Tesla simulation [8:15](https://www.youtube.com/watch?v=keWEE9FwS9o&t=495s) - Ashok Elluswamy
- Dojo supercomputer [9:46](https://www.youtube.com/watch?v=keWEE9FwS9o&t=586s) - Milan Kovac (Dir. of Eng. of Autopilot), Ganesh V. (Sr. Dir. Autopilot Hardware)
- Tesla Bot humanoid [16:18](https://www.youtube.com/watch?v=keWEE9FwS9o&t=978s) - Elon Musk


### [Tesla AI Day 2021 Cut (How lane changing works)](https://www.youtube.com/watch?v=W5Eo5EEbt0s) <a id="lanechanging">
<table><tr> <td> <b> Ashok Elluswamy </b> </td><td> CNET Highlights </td><td> 19 <b>Aug 2021</b> </td><td> 6 min </td> </tr></table>