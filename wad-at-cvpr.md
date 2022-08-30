# WAD at CVPR Keynote Notes
> Workshop on Autonomous Driving (WAD), at the Computer Vision and Pattern Recognition Conference (CVPR)

<br>


<details open><summary><h3>TABLE OF CONTENTS</h3></summary>

#### _KEYNOTES_

|  | Title | Speaker | Source | Time |
| - | ----- | ------- | ------ | ---- |
| 2022 | **AV2.0: Learning a Globally Scalable Driving Intelligence** | Alex Kendall | Wayve | 31 |
|  | **From Imitation Learning to Offline Reinforcement Learning** | Sergey Levine | UC Berkeley | 28 |
|  | **Deploying Autonomous Driving: Where are we now and what lies ahead?** | Yuning Chai | Cruise | 25 |
|  | **History of self-driving, escaping labeling, sensors, simulation** | Matthew J.-Roberson | CMU | 23 |
|  | **Waabi simulation; sensors, scenarios, learning** | Raquel Urtasun | Waabi/UofT | 38 |
|  | **Neural AV Simulation** | Sanja Fidler | Nvidia/UofT | 26 |
|  | **Why work on autonomy in academia?** | Philipp Krähenbühl | UT Austin | 29 |
|  | **Occupancy Networks** | Ashok Elluswamy | Tesla | 35 |
| | | | | |
| 2021 | **Vision vs. lidar/HD-map, NN training, hardware** | Andrej Karpathy | Tesla | 31 |
| | **Bridging Perception to Motion Planning** | Carl Wellington | Aurora | 27 |
| | **Perception and Action in the Open World** | Deva Ramanan | Argo/CMU | 32 |
| | **Interpretable Neural Motion Planner** | Raquel Urtasun | Waabi/UofT | 32 |
| | **AV Development at Massive Scale** | Sarah Tariq | Nvidia | 28 |
| | **Self-Supervised 3D Vision** | Adrien Gaidon | TTI | 22 |
| | **AV2.0: Reimagining autonomous mobility with embodied intelligence** | Alex Kendall | Wayve | 29 |
| | **Secure Learning for Autonomous Driving in Adversarial Environments** | Bo Li | UIUC | 28 |
| | | | | |
| 2020 | **Secure Learning in Adversarial Autonomous Driving Environments** | Bo Li | UIUC | 27 |
| | **Machine Learning for Autonomous Driving at Scale** | Drago Anguelov | Waymo | 35 |

#### _CHALLENGES_

| | Title | Source | Time |
| - | ----- | ------ | ---- |
| 2022 | **Argoverse Challenge** | Argo AI | 44 |
| | **nuPlan** | Motional | 5 |
| | **BDD100K** | ETH VIS | 22 |
| | **Waymo Open Dataset** | Waymo | 40 |
| | | | |
| 2021 | **Argoverse Challenge** | Argo AI | 55 |
| | **Waymo Open Dataset** | Waymo | 1 |
| | | | |
| 2020 | **Argoverse Challenge** | Argo AI | 28 |

</details>

<br>

# *Presentation Notes*
---


<details><summary><h2>2022</h2></summary>

#### Keynotes

| Title | Speaker | Source | Time |
| ----- | ------- | ------ | ---- |
| [**AV2.0: Learning a Globally Scalable Driving Intelligence**](#kendall2) | Alex Kendall | Wayve | 31 |
| [**From Imitation Learning to Offline RL**](#levine) | Sergey Levine | UC Berkeley | 28 |
| [**Deploying Autonomous Driving: Where are we now and what lies ahead?**](#chai) | Yuning Chai | Cruise | 25 |
| [**History of self-driving, escaping labeling, sensors, simulation**](#roberson) | Matthew J.-Roberson | CMU | 23 |
| [**Waabi simulation; sensors, scenarios, learning**](#urtasun2) | Raquel Urtasun | Waabi/UofT | 38 |
| [**Neural AV Simulation**](#fidler) | Sanja Fidler | Nvidia/UofT | 26 |
| [**Why work on autonomy in academia?**](#krahenbuhl) | Philipp Krähenbühl | UT Austin | 29 |
| [**Occupancy Networks**](#elluswamy) | Ashok Elluswamy | Tesla | 35 |

#### Challenges

| Title | Source | Time |
| ----- | ------ | ---- |
| [**Argoverse Challenge**](#argoverse3) | Argo AI | 44 |
| [**nuPlan**](#nuplan) | Motional | 5 |
| [**BDD100K**](#bdd100k) | ETH VIS | 22 |
| [**Waymo Open Dataset**](#opendataset2) | Waymo | 40 |

<br>

## VIDEO NOTES

## _Keynotes_

### [AV2.0: Learning a Globally Scalable Driving Intelligence](https://www.youtube.com/watch?v=UhDUczF47VI) <a id="kendall2"></a>
<table><tr> <td> <b> <a href="https://alexgkendall.com/">Alex Kendall</a> </b> </td><td> Wayve </td><td> 31 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

- Autonomous driving is an embodied intelligence problem [1:58](https://www.youtube.com/watch?v=UhDUczF47VI&t=118s)
- Learning to drive with end-to-end deep learning and computer vision [4:10](https://www.youtube.com/watch?v=UhDUczF47VI&t=250s)
- Video of the first time training a model to drive in 2015 [4:50](https://www.youtube.com/watch?v=UhDUczF47VI&t=290s)
- Grand challenges for scalable autonomy: [6:49](https://www.youtube.com/watch?v=UhDUczF47VI&t=409s)

1. **Adaptability**
    - Unlocking new markets faster [7:35](https://www.youtube.com/watch?v=UhDUczF47VI&t=455s)
        - Trained models to drive only in London, and were able to easily adapt to new cities they had never seen before
    - Adaptation to new vehicle types [8:30](https://www.youtube.com/watch?v=UhDUczF47VI&t=510s)
2. **Off-policy Learning**
    - Improving pedestrian safety with self-supervised learning [10:39](https://www.youtube.com/watch?v=UhDUczF47VI&t=639s)
    - Create a learning curriculum to solve pedestrian interaction [11:23](https://www.youtube.com/watch?v=UhDUczF47VI&t=683s)
    - Real-world results [11:50](https://www.youtube.com/watch?v=UhDUczF47VI&t=710s)
3. **Uncertainty**
    - Understanding epistemic model uncertainty: When and what we don't know [12:38](https://www.youtube.com/watch?v=UhDUczF47VI&t=758s)
    - Measuring uncertainty for autonomous driving with ensembles [13:14](https://www.youtube.com/watch?v=UhDUczF47VI&t=794s)
4. **Interpretability**
    - Visual attention masks [14:38](https://www.youtube.com/watch?v=UhDUczF47VI&t=878s)
5. **World Modeling**
    - Video example of why single-image predictions don't always work [16:35](https://www.youtube.com/watch?v=UhDUczF47VI&t=995s)
    - Multimodal future prediction (presented last year) [17:01](https://www.youtube.com/watch?v=UhDUczF47VI&t=1021s)
    - World models meet driving policy [17:36](https://www.youtube.com/watch?v=UhDUczF47VI&t=1056s)
    - Simulation example: Traffic light: two futures [18:40](https://www.youtube.com/watch?v=UhDUczF47VI&t=1120s)
    - Leveraging model-based imitation learning for closed-loop driving in CARLA [19:01](https://www.youtube.com/watch?v=UhDUczF47VI&t=1141s)
6. **Benchmarks & Simulation**
    - Simulation for autonomous driving [19:38](https://www.youtube.com/watch?v=UhDUczF47VI&t=1178s)
    - Simulation for adaptable driving intelligence [21:17](https://www.youtube.com/watch?v=UhDUczF47VI&t=1277s)
- QUESTIONS [24:09](https://www.youtube.com/watch?v=UhDUczF47VI&t=1449s)


#### Papers Cited
- [*Reimagining an autonomous vehicle*, Hawke et al. 2021](https://arxiv.org/abs/2108.05805)
	- [PDF](https://arxiv.org/pdf/2108.05805.pdf)
- [*What uncertainties do we need in bayesian deep learning for computer vision?*, Kendall & Gal. NeurIPS'17](https://arxiv.org/abs/1703.04977)
	- [PDF](https://arxiv.org/pdf/1703.04977.pdf)
- [*Bayesian SegNet: Model uncertainty for scene understanding*, Kendall et al. BMVC'17](https://arxiv.org/abs/1511.02680)
	- [PDF](https://arxiv.org/pdf/1511.02680.pdf)
- [*FIERY: Future instance prediction in bird's-eye view from surround monocular cameras*, Hu et al. 2021](https://arxiv.org/abs/2104.10490)
	- [PDF](https://arxiv.org/pdf/2104.10490.pdf)
	- [Code: wayveai/fiery](https://github.com/wayveai/fiery)


</details>

#

### [From Imitation Learning to Offline Reinforcement Learning](https://www.youtube.com/watch?v=Od9CVqzIgZ8) <a id="levine"></a>
<table><tr> <td> <b> Sergey Levine </b> </td><td> UC Berkeley </td><td> 28 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

#### *Note: "RL" = Reinforcement Learning*

- End-to-end learning-based control [0:24](https://www.youtube.com/watch?v=Od9CVqzIgZ8&t=24s)
- Can we do this with RL? [1:11](https://www.youtube.com/watch?v=Od9CVqzIgZ8&t=71s)
    - What is RL?
        1. Framework for learning-based decision making
        2. Active, online learning algorithms for control
- Making RL look more like supervised learning [3:00](https://www.youtube.com/watch?v=Od9CVqzIgZ8&t=180s)
    - Offline RL: Take a dataset that you collected previously, and train on that
- Imitation learning and offline RL [3:44](https://www.youtube.com/watch?v=Od9CVqzIgZ8&t=224s)
    - Only difference is that offline RL doesn't assume driving behaviors we're training on are optimal
- What's the difference? [5:43](https://www.youtube.com/watch?v=Od9CVqzIgZ8&t=343s)
- What's the similarity? [7:16](https://www.youtube.com/watch?v=Od9CVqzIgZ8&t=436s)
    - Any functional offline RL method must do:
        1. Stay close to the provided data
        2. Maximize reward
- Why is this even a question? [9:00](https://www.youtube.com/watch?v=Od9CVqzIgZ8&t=540s)
    - i.e. shouldn't RL just always be better than imitation?
    - Imitation learning has some advantages:
        - Behavioral cloning is simple and easy
            - Stable, scalable for large data, and easy to debug
        - There are some ways to use rewards in imitation
- Putting offline RL & Behavioral Cloning (BC) side by side [11:03](https://www.youtube.com/watch?v=Od9CVqzIgZ8&t=663s)
- Why is BC difficult? [11:37](https://www.youtube.com/watch?v=Od9CVqzIgZ8&t=697s)
    - Mistakes can compound. You make a mistake, and now you're in a different state, so you're more likely to make another mistake, and so on
- Why might RL help? [14:32](https://www.youtube.com/watch?v=Od9CVqzIgZ8&t=872s)
    - By incorporating dynamics into the update, value-based offline RL is **aware of the consequences of actions**
    - Offline RL can benefit from suboptimal data
- The formal results [16:18](https://www.youtube.com/watch?v=Od9CVqzIgZ8&t=978s)
- Combining behavioral cloning and RL [20:19](https://www.youtube.com/watch?v=Od9CVqzIgZ8&t=1219s)
- Various instantiations [21:05](https://www.youtube.com/watch?v=Od9CVqzIgZ8&t=1265s)
    - Deep imitative models [21:40](https://www.youtube.com/watch?v=Od9CVqzIgZ8&t=1300s)
    - Trajectory transformer [24:37](https://www.youtube.com/watch?v=Od9CVqzIgZ8&t=1477s)
- VIKING: Kilometer-Scale Navigation [27:01](https://www.youtube.com/watch?v=Od9CVqzIgZ8&t=1621s)
- Takeaways [27:38](https://www.youtube.com/watch?v=Od9CVqzIgZ8&t=1658s)

#### External Links/Papers

- [*When should we prefer offline reinforcement learning over behavioral cloning?*, Kumar et al. ICLR'22](https://arxiv.org/abs/2204.05618)
	- [PDF](https://arxiv.org/pdf/2204.05618.pdf)
- [*Offline reinforcement learning as one big sequence modeling problem*, Janner et al. NeurIPS'21](https://arxiv.org/abs/2106.02039)
	- [PDF](https://arxiv.org/pdf/2106.02039.pdf)
	- [Code: JannerM/trajectory-transformer](https://github.com/JannerM/trajectory-transformer)


</details>

#

### [Deploying Autonomous Driving: Where are we now and what lies ahead?](https://www.youtube.com/watch?v=EJ0hgOc0XLA) <a id="chai"></a>
<table><tr> <td> <b> Yuning Chai </b> </td><td> Cruise </td><td> 25 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

- Cruise's current product in San Francisco [1:12](https://www.youtube.com/watch?v=EJ0hgOc0XLA&t=72s)
- Rollout schedule [2:00](https://www.youtube.com/watch?v=EJ0hgOc0XLA&t=120s)
- Remaining challenges [2:53](https://www.youtube.com/watch?v=EJ0hgOc0XLA&t=173s)
    - Scaling in San Francisco, new locations, and to new platforms
        - Demo [3:32](https://www.youtube.com/watch?v=EJ0hgOc0XLA&t=212s)
- Quantifying epistemic uncertainty [6:13](https://www.youtube.com/watch?v=EJ0hgOc0XLA&t=373s)
    - Knowing when the models do not know something
    - Example - person running into street [7:06](https://www.youtube.com/watch?v=EJ0hgOc0XLA&t=426s)
    - **Aleatory** vs. **epistemic** uncertainty [9:29](https://www.youtube.com/watch?v=EJ0hgOc0XLA&t=569s)
    - <img width="500" alt="image" src="https://user-images.githubusercontent.com/90723578/187085962-2731dd0c-153a-42e6-95c8-8882fb788882.png">
    - Example - qualitative result [12:50](https://www.youtube.com/watch?v=EJ0hgOc0XLA&t=770s)
- In defense of **radar** [14:11](https://www.youtube.com/watch?v=EJ0hgOc0XLA&t=851s)
    - Radar gives redundancy and is critical for adverse weather
    - Example images of camera/lidar lens being blocked [14:55](https://www.youtube.com/watch?v=EJ0hgOc0XLA&t=895s)
    - Our proprietary radar technology [16:04](https://www.youtube.com/watch?v=EJ0hgOc0XLA&t=964s)
    - Opportunities for research into radar [16:30](https://www.youtube.com/watch?v=EJ0hgOc0XLA&t=990s)
        - With and without radar ego-motion compensation
        - Radar + camera vs. Radar
- Adversarial reinforcement learning agents [17:53](https://www.youtube.com/watch?v=EJ0hgOc0XLA&t=1073s)
    - Our approach: train adversarial agents who seek to get hit by our AV, and use them to train the car. [18:53](https://www.youtube.com/watch?v=EJ0hgOc0XLA&t=1133s)
    - Example: Jaywalker behind occlusion [20:38](https://www.youtube.com/watch?v=EJ0hgOc0XLA&t=1238s)
- Data mining: **triggers** [22:27](https://www.youtube.com/watch?v=EJ0hgOc0XLA&t=1347s)
    1. Signals from safety drivers aren't as useful anymore
    2. Then, they *hand-crafted* features, and searched their data for similar events. But the searching wasn't accurate enough
    3. Now, adopted a **few-shot active learning strategy** to actually train models to identify the triggers, so they can accurately search for them
- Investing heavily in tooling automation [23:30](https://www.youtube.com/watch?v=EJ0hgOc0XLA&t=1410s)

#### External Links/Papers

- [*Simple and Scalable Predictive Uncertainty Estimation using Deep Ensembles*, Lakshminarayanan et al. NIPS'17](https://arxiv.org/abs/1612.01474)
	- [PDF](https://arxiv.org/pdf/1612.01474.pdf)
- [*Bayesian deep learning and a probabilistic perspective of generalization*, Wilson & Izmailov. 2020](https://arxiv.org/abs/2002.08791)
	- [PDF](https://arxiv.org/pdf/2002.08791.pdf)
	- [Code: izmailovpavel/understandingbdl](https://github.com/izmailovpavel/understandingbdl)


</details>

#

### [History of self-driving, escaping labeling, sensors, simulation](https://www.youtube.com/watch?v=I4QEZxfPUmc) <a id="roberson"></a>
<table><tr> <td> <b> Matthew J.-Roberson </b> </td><td> CMU </td><td> 23 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

- History of self-driving: The idea is actually very old. AVs were built in the 50s that controlled steering using metal cables embedded in the roadway
- How do we escape paying for labeled datasets to train with? [3:56](https://www.youtube.com/watch?v=I4QEZxfPUmc&t=236s)
- Examples of **perception challenges** - smoke, fog, glare, dark, motion blur [4:54](https://www.youtube.com/watch?v=I4QEZxfPUmc&t=294s)
- Identifying perception failures
    - Simple technique: Look for missed-detections in a series of frames across time. [5:30](https://www.youtube.com/watch?v=I4QEZxfPUmc&t=330s)
        - **Stereo inconsistencies** as hypotheses (if left camera sees something, the right camera should also identify it) [7:09](https://www.youtube.com/watch?v=I4QEZxfPUmc&t=429s)
    - Correlate errors with geo-locations. Find places on a map where errors are most common [8:05](https://www.youtube.com/watch?v=I4QEZxfPUmc&t=485s)
- **Thermal cameras** [8:46](https://www.youtube.com/watch?v=I4QEZxfPUmc&t=526s)
    - Cheap versus high quality thermal cameras. How do we make the most of the cheaper, noisier image so we can use thermal imaging at a low cost?
- **Understanding risk** [10:58](https://www.youtube.com/watch?v=I4QEZxfPUmc&t=658s)
    - How does it work? Calculate a **forward reachability set** for all vehicles in the scene. [13:28](https://www.youtube.com/watch?v=I4QEZxfPUmc&t=808s)
        - FRS uses all the vehicle's dynamics to determine all places the vehicle could possibly end up in the future.
- Simulation
    - **Simulation - GTA 5**: Training on GTA 5 data partially works, but the image data is very different from real-world images [15:45](https://www.youtube.com/watch?v=I4QEZxfPUmc&t=945s)
    - Solution: use physics to make simulated data look much more like real data [17:30](https://www.youtube.com/watch?v=I4QEZxfPUmc&t=1050s)
        - Add things like chromatic aberration, blur, exposure issues, etc.
    - Limitations of these simulation techniques [19:40](https://www.youtube.com/watch?v=I4QEZxfPUmc&t=1180s)

#### External Links/Papers

- [*Failing to Learn: Autonomously Identifying Perception Failures for Self-driving Cars*, Ramanagopal et al. IROS'18](https://arxiv.org/abs/1707.00051)
	- [PDF](https://arxiv.org/pdf/1707.00051.pdf)
- [*Pixel-Wise Motion Deblurring of Thermal Videos*, Ramanagopal et al. CVPR'20](https://arxiv.org/abs/2006.04973)
	- [PDF](https://arxiv.org/pdf/2006.04973.pdf)
- [*Risk Assessment and Planning with Bidirectional Reachability for Autonomous Driving*, Yu et al. 2019](https://arxiv.org/abs/1909.08059)
	- [PDF](https://arxiv.org/pdf/1909.08059.pdf)
- [*Modeling Camera Effects to Improve Visual Learning from Synthetic Data*, Carlson et al. CVPR'18](https://arxiv.org/abs/1803.07721)
	- [PDF](https://arxiv.org/pdf/1803.07721.pdf)
	- [Code: alexacarlson/SensorEffectAugmentation](https://github.com/alexacarlson/SensorEffectAugmentation)


</details>

#

### [Waabi simulation; sensors, scenarios, learning](https://www.youtube.com/watch?v=g0uIVWecws4) <a id="urtasun2"></a>
<table><tr> <td> <b> <a href="http://www.cs.toronto.edu/~urtasun/">Raquel Urtasun</a> </b> </td><td> Waabi/UofT </td><td> 38 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

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

#### External Links
- [Waabi Website](https://waabi.ai/)
- [Waabi Jobs](https://jobs.lever.co/waabi)


</details>

#

### [Neural AV Simulation](https://www.youtube.com/watch?v=K1RvII74zW4) <a id="fidler"></a>
<table><tr> <td> <b> <a href="https://www.cs.utoronto.ca/~fidler/">Sanja Fidler</a> </b> </td><td> Nvidia/UofT </td><td> 26 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

- Open-loop vs. closed-loop AV simulation [1:50](https://www.youtube.com/watch?v=K1RvII74zW4&t=110s)
- P&C Simulation [5:19](https://www.youtube.com/watch?v=K1RvII74zW4&t=319s)
    - <img width="600" alt="image" src="https://user-images.githubusercontent.com/90723578/187083584-c7be4eae-5fee-443f-a235-02eaf23860b8.png">
- Nvidia DriveSim [6:40](https://www.youtube.com/watch?v=K1RvII74zW4&t=400s)
    - Ground truth from the simulator [7:42](https://www.youtube.com/watch?v=K1RvII74zW4&t=462s)
    - Synthetic data generation [8:25](https://www.youtube.com/watch?v=K1RvII74zW4&t=505s)
- AI tooling for graphics-based simulation
    - *Scenario Reconstruction* [9:24](https://www.youtube.com/watch?v=K1RvII74zW4&t=564s)
    - *Adversarial Scenario Generation* [11:19](https://www.youtube.com/watch?v=K1RvII74zW4&t=679s)
    - *Content Synthesis* - let AI create variation in the content [13:17](https://www.youtube.com/watch?v=K1RvII74zW4&t=797s)
    - *Character Animation* [15:37](https://www.youtube.com/watch?v=K1RvII74zW4&t=937s)
- Video example - *Towards Perfect Reconstruction* [18:40](https://www.youtube.com/watch?v=K1RvII74zW4&t=1120s)
    - Final demo, and explanation of how reconstruction works [19:42](https://www.youtube.com/watch?v=K1RvII74zW4&t=1182s)
- NVIDIA Toronto AI Research Team [26:01](https://www.youtube.com/watch?v=K1RvII74zW4&t=1561s)

#### External Links/Papers

- [Nvidia AI Website](https://nv-tlabs.github.io)
- [*Generating Useful Accident-Prone Driving Scenarios via a Learned Traffic Prior*, Rempe et al. CVPR'22.](https://nv-tlabs.github.io/STRIVE)
    - [arXiv](https://arxiv.org/abs/2112.05077)
    - [PDF](https://nv-tlabs.github.io/STRIVE/docs/strive.pdf)
    - [Github: nv-tlabs/STRIVE](https://github.com/nv-tlabs/STRIVE)
- [*AUV-Net: Learning Aligned UV Maps for Texture Transfer and Synthesis*, Chen et al. CVPR'22.](https://nv-tlabs.github.io/AUV-NET/)
    - [arXiv](https://arxiv.org/abs/2204.03105)
    - [PDF](https://nv-tlabs.github.io/AUV-NET/assets/auvnet-paper.pdf)
- [*Extracting Triangular 3D Models, Materials, and Lighting From Images*, Munkberg et al. CVPR'22](https://nvlabs.github.io/nvdiffrec/)
    - [arXiv](https://arxiv.org/abs/2111.12503)
    - [PDF](https://nvlabs.github.io/nvdiffrec/assets/paper.pdf)
    - [Github: NVlabs/nvdiffrec](https://github.com/NVlabs/nvdiffrec)
- [Other publications](https://nv-tlabs.github.io/publication/)


</details>

#

### [Why work on autonomy in academia?](https://www.youtube.com/watch?v=Lk_X08NejX0) <a id="krahenbuhl"></a>
<table><tr> <td> <b> Philipp Krähenbühl </b> </td><td> UT Austin </td><td> 29 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

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

#### External Links/Papers
- [nuScenes dataset](https://www.nuscenes.org/)
- [*Center-based 3D Object Detection and Tracking*, Yin et al. CVPR'20](https://arxiv.org/abs/2006.11275)
	- [PDF](https://arxiv.org/pdf/2006.11275.pdf)
	- [Code: tianweiy/CenterPoint](https://github.com/tianweiy/CenterPoint)
- [*Cross-view Transformers for real-time Map-view Semantic Segmentation*, Zhou & Krähenbühl. CVPR'22](https://arxiv.org/abs/2205.02833)
	- [PDF](https://arxiv.org/pdf/2205.02833.pdf)
	- [Code: bradyz/cross_view_transformers](https://github.com/bradyz/cross_view_transformers)
- [*ALVINN: An autonomous land vehicle in a neural network*, Pomerleau et al. 1989](https://proceedings.neurips.cc/paper/1988/file/812b4ba287f5ee0bc9d43bbf5bbe87fb-Paper.pdf)
- [*DART: Noise Injection for Robust Imitation Learning*, Laskey et al. 2017](https://arxiv.org/abs/1703.09327)
	- [PDF](https://arxiv.org/pdf/1703.09327.pdf)
	- [Code: BerkeleyAutomation/DART](https://github.com/BerkeleyAutomation/DART)
- [*Learning by Cheating*, Chen et al. CoRL'19](https://arxiv.org/abs/1912.12294)
	- [PDF](https://arxiv.org/pdf/1912.12294.pdf)
	- [Code: dotchen/LearningByCheating](https://github.com/dotchen/LearningByCheating)
- [*Learning from all vehicles*, Chen & Krähenbühl. CVPR'22](https://openaccess.thecvf.com/content/CVPR2022/papers/Chen_Learning_From_All_Vehicles_CVPR_2022_paper.pdf)
- [*Learning to drive from a world on rails*, Chen et al. ICCV'21](https://arxiv.org/abs/2105.00636)
	- [PDF](https://arxiv.org/pdf/2105.00636.pdf)
	- [Code: dotchen/WorldOnRails](https://github.com/dotchen/WorldOnRails)


</details>

#

### [Occupancy Networks](https://www.youtube.com/watch?v=jPCV4GKX9Dw) <a id="elluswamy"></a>
<table><tr> <td> <b> Ashok Elluswamy </b> </td><td> Tesla </td><td> 35 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

- Full Self-Driving Beta Software [1:53](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=113s)
- Why classical image space is not sufficient; 3D space is needed [3:22](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=202s)
- **Depth maps** (old design) versus **occupancy networks** (new design)
    - *Old design*: depth maps (depth on a per-pixel basis) [5:10](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=310s)
        - Predictions are inaccurate at long distances
        - Inconsistent resolution. Nearer objects have much more detail, and farther objects have less detail. This makes it difficult for the planning stack to have good logic around avoiding obstacles
        - It's harder to predict around occlusions
        - More memory intensive
    - *New solution*: occupancy networks [6:42](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=402s)
        - Occupancy networks: properties [7:20](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=440s)
        - Volumetric occupancy in 3d space, so it persists through occlusions
        - A single output is produced from the network, so there is no stitching camera feeds together
        - Consistent resolution in relevant driving area
        - Faster, more memory efficient. The entire occupancy network is produced in 10ms, faster than the frame rate of the cameras.
- **Occupancy Network - Architecture** [9:40](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=580s)
- Why it was a bad idea to have separate networks for dealing with moving and stationary objects
    - *Old design*: separate networks for moving and stationary objects [11:51](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=711s)
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
- Occupancy Networks - NeRFs [22:11](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=1331s)
- **Collision avoidance** when NOT using autopilot - intervening to prevent crashes [23:45](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=1425s)
    - Currently, autopilot prevents 40 crashes per day due to accelerator misapplications
- **Implicit networks** for collision avoidance [25:16](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=1516s)
    - Simply making a system "safe" is not enough
    - A good system must be **safe, comfortable, AND reasonably fast**
    - Driving safely is easy if the car can brake hard and drive slow.
    - The **challenge of smooth driving** while also being safe [27:16](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=1636s)
        - The problem is, you need to predict a crash many seconds in the future so you can brake early.
        - A naive approach (search-based techniques) is far too slow because the search-space is too large.
    - The solution: approximate them with neural networks: **implicit fields** [27:54](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=1674s)
        - Produce implicit fields that encode obstacle avoidance
        - Compress the occupancy from previous networks into an MLP that's an implicit representation of whether a collision is avoidable or not from any particular query state
    - Super cool visualization of **collision field** over time horizon [30:59](https://www.youtube.com/watch?v=jPCV4GKX9Dw&t=1859s)


#### External Links/Papers
- [*NeRF: Representing Scenes as Neural Radiance Fields for View Synthesis*, Mildenhall et al. ECCV'20](https://arxiv.org/abs/2003.08934)
    - [PDF](https://arxiv.org/pdf/2003.08934.pdf)
    - [Code: bmild/nerf](https://github.com/bmild/nerf)
- [*Plenoxels: Radiance Fields without Neural Networks*, Yu et al. 2021](https://arxiv.org/abs/2112.05131)
    - [PDF](https://arxiv.org/pdf/2112.05131.pdf)
    - [Code: sxyu/svox2](https://github.com/sxyu/svox2)


</details>

#

<br>

## _Challenges_

### [Argoverse Challenge](https://www.youtube.com/watch?v=Z1q9ijuLLvU) <a id="argoverse3"></a>
<table><tr> <td> <b> Argo AI </b> </td><td> 44 min </td> </tr> </table>

<details><summary> <b> Notes </b> </summary>

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

</details>

#

### [nuPlan](https://www.youtube.com/watch?v=R9w_0Fz19pQ) <a id="nuplan"></a>
<table><tr> <td> <b> Motional </b> </td> <td> Juraj Kabzan </td> <td> 5 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

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

</details>

#

### [BDD100K](https://www.youtube.com/watch?v=13PjjBEgEcM) <a id="bdd100k"></a>
<table><tr> <td> <b> ETH VIS </b> </td><td> 22 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

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

</details>

#

### [Waymo Open Dataset](https://www.youtube.com/watch?v=G01cfxuJ_ro) <a id="opendataset2"></a>
<table><tr> <td> <b> Waymo </b> </td><td> 40 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

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


</details>

#

---

</details>

<br>

<details><summary><h2>2021</h2></summary>

#### Keynotes

| Title | Speaker | Source | Time |
| ----- | ------- | ------ | ---- |
| [**Vision vs. lidar/HD-map, NN training, hardware**](#karpathy) | Andrej Karpathy | Tesla | 31 |
| [**Bridging Perception to Motion Planning**](#wellington) | Carl Wellington | Aurora | 27 |
| [**Perception and Action in the Open World**](#ramanan) | Deva Ramanan | Argo/CMU | 32 |
| [**Interpretable Neural Motion Planner**](#urtasun) | Raquel Urtasun | Waabi/UofT | 32 |
| [**AV Development at Massive Scale**](#tariq) | Sarah Tariq | Nvidia | 28 |
| [**Self-Supervised 3D Vision**](#gaidon) | Adrien Gaidon | TTI | 22 |
| [**AV2.0: Reimagining autonomous mobility with embodied intelligence**](#kendall) | Alex Kendall | Wayve | 29 |
| [**Secure Learning for Autonomous Driving in Adversarial Environments**](#li2) | Bo Li | UIUC | 28 |

#### Challenges

| Title | Source | Time |
| ----- | ------ | ---- |
| [**Argoverse Challenge**](#argoverse2) | Argo AI | 55 |
| [**Waymo Open Dataset**](#opendataset) | Waymo | 1 |

<br>

## VIDEO NOTES

### _Keynotes_

### [The vision-only approach, NN training, hardware](https://www.youtube.com/watch?v=g6bOwQdCJrc) <a id="karpathy"></a>
<table><tr> <td> <b> <a href="https://karpathy.ai/">Andrej Karpathy</a> </b> </td><td> Tesla </td><td> 31 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

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

#### External Links

- [Join Tesla AI Team](https://www.tesla.com/autopilotAI)


</details>

#

### [Bridging Perception to Motion Planning](https://www.youtube.com/watch?v=YQ_yar_5Q98) <a id="wellington"></a>
<table><tr> <td> <b> <a href="http://www.carlwellington.com/">Carl Wellington</a> </b> </td><td> Aurora </td><td> 27 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

- What is Aurora?
    - Self-driving system. First product is **Trucks**
- Overview of self-driving system: **Joint Perception and Forecasting** [1:20](https://www.youtube.com/watch?v=YQ_yar_5Q98&t=80s)
- **Forecasting** is the area upon which Aurora improves the most
- Example of single-mode vs multimodal forecasting with uncertainty [3:24](https://www.youtube.com/watch?v=YQ_yar_5Q98&t=204s)
- Benefit of using **radar** [5:43](https://www.youtube.com/watch?v=YQ_yar_5Q98&t=343s)
- **Input Representation**: Lidar Range View [6:57](https://www.youtube.com/watch?v=YQ_yar_5Q98&t=417s)
    - Can we use raw input data directly and work in image space instead of 3D space? [7:58](https://www.youtube.com/watch?v=YQ_yar_5Q98&t=478s)
        - VERY interesting theory. Exact opposite of Ashok's 2022 talk.
        - It avoids approximations and processes every single lidar point
        - Easier to process, and more structure
        - Somehow, Carl believes that using raw depth information allows you to see and reason around occlusions better than if you had projected it into 3D. He also says that it's more computationally efficient than 3D projections, even though you're dealing with more data points.
    - **Lidar + Camera** [10:39](https://www.youtube.com/watch?v=YQ_yar_5Q98&t=639s)
        - Since we're working in *range view*, or 2D space, it's very easy to combine camera and lidar data. Since there's no 3D projections, you can just lay the camera features on top of the lidar points
- Video demo of the system [12:33](https://www.youtube.com/watch?v=YQ_yar_5Q98&t=753s)
- Summary of first section [13:00](https://www.youtube.com/watch?v=YQ_yar_5Q98&t=780s)
    - Learning end-to-end
    - Key point: The features that you want on the sensor data for understanding the motion and velocities of actors are quite different from the features that you want for *detection*
- Challenges of forward-pass data-driven forecasting [13:56](https://www.youtube.com/watch?v=YQ_yar_5Q98&t=836s)
    - Decision problem: You're a semi truck in the right lane on a highway, and vehicles are merging in on your right. Do you speed up, slow down to let them in, or stay put?
- Actor goals. What are other cars trying to do? [19:43](https://www.youtube.com/watch?v=YQ_yar_5Q98&t=1183s)
    - Goals relative to map geometry [20:36](https://www.youtube.com/watch?v=YQ_yar_5Q98&t=1236s)
        - Based on the layout of intersections, we can reason about where pedestrians and vehicles will want to go
        - Lane goals, and crossing goals
- Closing talk [23:56](https://www.youtube.com/watch?v=YQ_yar_5Q98&t=1436s)

#### External Links/Papers
- [*LiRaNet: End-to-End Trajectory Prediction using Spatio-Temporal Radar Fusion*, Shah et al. PMLR'20](https://proceedings.mlr.press/v155/shah21a.html)
    - [PDF](https://proceedings.mlr.press/v155/shah21a/shah21a.pdf)
- [*MultiXNet: Multiclass Multistage Multimodal Motion Prediction*, Djuric et al. IV'21](https://arxiv.org/abs/2006.02000)
	- [PDF](https://arxiv.org/pdf/2006.02000.pdf)
- [*LaserFlow: Efficient and Probabilistic Object Detection and Motion Forecasting*, Meyer et al. CVPR'20](https://arxiv.org/abs/2003.05982)
	- [PDF](https://arxiv.org/pdf/2003.05982.pdf)
- [*RV-FuseNet: Range View Based Fusion of Time-Series LiDAR Data for Joint 3D Object Detection and Motion Forecasting*, Laddha et al. IROS'21](https://arxiv.org/abs/2005.10863)
	- [PDF](https://arxiv.org/pdf/2005.10863.pdf)
- [*Multi-View Fusion of Sensor Data for Improved Perception and Prediction in Autonomous Driving*, Fadadu et al. CVPR'20](https://arxiv.org/abs/2008.11901)
	- [PDF](https://arxiv.org/pdf/2008.11901.pdf)
- [*MVFuseNet: Improving End-to-End Object Detection and Motion Forecasting through Multi-View Fusion of LiDAR Data*, Laddha et al. CVPR'21](https://arxiv.org/abs/2104.10772)
	- [PDF](https://arxiv.org/pdf/2104.10772.pdf)
- [*Map-Adaptive Goal-Based Trajectory Prediction*, Zhang et al. CoRL'20](https://arxiv.org/abs/2009.04450)
	- [PDF](https://arxiv.org/pdf/2009.04450.pdf)


</details>

#

### [Perception and Action in the Open World](https://www.youtube.com/watch?v=N-A5qnYXw_U) <a id="ramanan"></a>
<table><tr> <td> <b> <a href="https://www.cs.cmu.edu/~deva/">Deva Ramanan</a> </b> </td><td> Argo/CMU </td><td> 32 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

- Critical challenges of autonomy in the open world [1:46](https://www.youtube.com/watch?v=N-A5qnYXw_U&t=106s)
    - AV death: car hits bicyclist. The system changed the person's classification several times, and, by design, excluded tracking history for nonpersisting objects, so it couldn't predict its path
    - Building *stable* interpretations of a dynamic world is hard [5:06](https://www.youtube.com/watch?v=N-A5qnYXw_U&t=306s)
    - Streaming perception is an issue. [6:19](https://www.youtube.com/watch?v=N-A5qnYXw_U&t=379s)
        - By the time an alg finishes, the world has changed
- *Perceive and act in continuous-time world* [7:30](https://www.youtube.com/watch?v=N-A5qnYXw_U&t=450s)
    - Normal approach: to realtime/anytime algorithms: [10:35](https://www.youtube.com/watch?v=N-A5qnYXw_U&t=635s): the algorithm *must* finish in a specific amount of time, such as before the next frame, for instance
    - Our approach: [10:55](https://www.youtube.com/watch?v=N-A5qnYXw_U&t=655s): the algorithm can *choose* when to finish processing, but in the meantime, has to spit out an intermediate answer about what the world is doing. Convert any single-frame metric into a streaming metric
    - Results [11:15](https://www.youtube.com/watch?v=N-A5qnYXw_U&t=675s)
    - Surprising conclusions [12:44](https://www.youtube.com/watch?v=N-A5qnYXw_U&t=764s)
        - Performance/compute tradeoff to maximize streaming perception
        - Idle and wait for new frame to arrive
        - Instead of optimizing for average precision, optimize for streaming average precision
    - Reaction times in biological vision [16:39](https://www.youtube.com/watch?v=N-A5qnYXw_U&t=999s)
- Argoverse challenge - Streaming CVPR 21 benchmark [18:42](https://www.youtube.com/watch?v=N-A5qnYXw_U&t=1122s)
- Some interesting findings [19:49](https://www.youtube.com/watch?v=N-A5qnYXw_U&t=1189s)
    - Attentional processing via smart **foveated subsampling**
- Benchmarks: tracking any object TAO [20:36](https://www.youtube.com/watch?v=N-A5qnYXw_U&t=1236s) (not just AV related)
    - Diverse data, not big data
    - Semantics: Can we track never-before-seen objects?
- 3D from 2D images [22:44](https://www.youtube.com/watch?v=N-A5qnYXw_U&t=1364s)
    - Use multiple frames, not single images
- 2D vs 3D-ish motion [24:45](https://www.youtube.com/watch?v=N-A5qnYXw_U&t=1485s)
    - **Optical expansion** (time-to-contact) instead of **depth maps** [25:24](https://www.youtube.com/watch?v=N-A5qnYXw_U&t=1524s): Visualize the *rate* of expansion of every pixel. This is different from depth maps because if you're moving fast towards a far-away object, or slow towards a nearby object, the returned value will be the same
- Build motion systems that infer depth changes through flow divergence [27:06](https://www.youtube.com/watch?v=N-A5qnYXw_U&t=1626s)
- Motion based object detection [27:16](https://www.youtube.com/watch?v=N-A5qnYXw_U&t=1636s)
- Segmenting rigid motions [28:51](https://www.youtube.com/watch?v=N-A5qnYXw_U&t=1731s)
- Code and results [29:00](https://www.youtube.com/watch?v=N-A5qnYXw_U&t=1740s)
- Motion-based detection [29:12](https://www.youtube.com/watch?v=N-A5qnYXw_U&t=1752s)

#### External Links/Papers

- [*Towards Streaming Perception*, Li et al. ECCV'20](https://arxiv.org/abs/2005.10420)
	- [PDF](https://arxiv.org/pdf/2005.10420.pdf)
- [*Upgrading Optical Flow to 3D Scene Flow Through Optical Expansion*, Yang & Ramanan. CVPR'20](https://openaccess.thecvf.com/content_CVPR_2020/html/Yang_Upgrading_Optical_Flow_to_3D_Scene_Flow_Through_Optical_Expansion_CVPR_2020_paper.html)
    - [PDF](https://openaccess.thecvf.com/content_CVPR_2020/papers/Yang_Upgrading_Optical_Flow_to_3D_Scene_Flow_Through_Optical_Expansion_CVPR_2020_paper.pdf)
- [*Binary TTC: A Temporal Geofence for Autonomous Navigation*, Badki et al. CVPR'21](https://arxiv.org/abs/2101.04777)
	- [PDF](https://arxiv.org/pdf/2101.04777.pdf)
	- [Code: NVlabs/BiTTC](https://github.com/NVlabs/BiTTC)
- [*Learning to Segment Rigid Motions from Two Frames*, Yang & Ramanan. CVPR'21](https://arxiv.org/abs/2101.03694)
	- [PDF](https://arxiv.org/pdf/2101.03694.pdf)
	- [Code: gengshan-y/rigidmask](https://github.com/gengshan-y/rigidmask)
- [*LASR: Learning Articulated Shape Reconstruction from a Monocular Video*, Yang et al. CVPR'21](https://lasr-google.github.io/)
    - [arXiv](https://arxiv.org/abs/2105.02976)
        - [PDF](https://arxiv.org/pdf/2105.02976.pdf)
	- [Code: google/lasr](https://github.com/google/lasr)
- [*What You See is What You Get: Exploiting Visibility for 3D Object Detection*, Hu et al. CVPR'20](https://arxiv.org/abs/1912.04986)
	- [PDF](https://arxiv.org/pdf/1912.04986.pdf)
	- [Code: peiyunh/wysiwyg](https://github.com/peiyunh/wysiwyg)
- [*Safe Local Motion Planning With Self-Supervised Freespace Forecasting*, Hu et al. CVPR'21](https://openaccess.thecvf.com/content/CVPR2021/html/Hu_Safe_Local_Motion_Planning_With_Self-Supervised_Freespace_Forecasting_CVPR_2021_paper.html)
    - [PDF](https://openaccess.thecvf.com/content/CVPR2021/papers/Hu_Safe_Local_Motion_Planning_With_Self-Supervised_Freespace_Forecasting_CVPR_2021_paper.pdf)
- [*Learning by Cheating*, Chen et al. CoRL'19](https://arxiv.org/abs/1912.12294)
	- [PDF](https://arxiv.org/pdf/1912.12294.pdf)
	- [Code: dotchen/LearningByCheating](https://github.com/dotchen/LearningByCheating)


</details>

#

### [Interpretable Neural Motion Planner](https://www.youtube.com/watch?v=PSZ2Px9PrHg) <a id="urtasun"></a>
<table><tr> <td> <b> <a href="http://www.cs.toronto.edu/~urtasun/">Raquel Urtasun</a> </b> </td><td> Waabi/UofT </td><td> 32 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

- Why is self-driving not solved yet?
    - Need the ability for real-time, high fidelity closed-loop simulation
- What Waabi is building [1:17](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=77s)
    - Ai-first approach
    - Best close-loop simulator, so we don't depend on driving millions of real world miles
    - Start with long haul trucking
- How self-driving works - typical approach to self-driving [3:48](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=228s)
    - Disadvantages of traditional software stack [5:04](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=304s)
    - Traditional end-to-end approach [6:28](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=388s)
        - System is not interpretable. If it does something wrong, you don't know why. And you can't let it learn by killing people.
- Our solution: **Interpretable Neural Motion Planning** [7:30](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=450s)
    - Best of both worlds.
    - Modular, and interpretable
    - But still **end-to-end trainable**
- Our first generation design diagram [8:24](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=504s)
    - Multi-task problem
    - Detect objects of interest, predict the motion into the future
    - Evaluate a sample of all possible trajectories, optimize for lowest cost. Easy.
    - Video example [10:12](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=612s)
- What's wrong with detection based perception? [11:08](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=668s)
    - Your object detector has a threshold. If you detect something that doesn't meet the threshold, then you have to ignore it. Very dangerous
- Better alternative: [12:05](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=725s) **SEMANTIC OCCUPANCIES**
    - Instead of going from detection boxes and thresholds to occupancy, can't we just go to occupancy directly?
    - Semantic hierarchy [12:42](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=762s) of object classes
- Occupancy Forecasting architecture [14:10](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=850s)
- Motion planning [14:57](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=897s)
    - Sample possible trajectories, evaluate, select minimum cost
    - Trajectory sampling and eval [15:30](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=930s)
        - Map-aware, behavior-based
- End to end training [16:54](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=1014s)
    - COMPARISON with **Waymo Multipath** and others [18:05](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=1085s)
    - Charts of improvements had by end-to-end and occupancy [18:44](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=1124s)
- Visualization of qualitative results [19:34](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=1174s)
- Why closed-loop simulation? [20:52](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=1252s)
- Intro to our simulator [21:58](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=1318s)
    - Virtual world creation from raw data
    - Automatic scenario generation
    - End to end Safety Critical Evaluation [24:40](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=1480s)
    - VIDEO EXAMPLE of simulation. [25:09](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=1509s) Insanely realistic.
    - Closed loop simulator diagram of system [26:02](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=1562s)
    - Results from experiments in closed-loop system [26:29](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=1589s)
- MP3 Motivation: **HD Maps** vs **mapless** driving [27:11](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=1631s)
    - Semantic scene representations [29:03](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=1743s)
    - Probabilistic model for dynamic occupancy [29:38](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=1778s)
    - Routing [30:07](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=1807s)
- Results [30:34](https://www.youtube.com/watch?v=PSZ2Px9PrHg&t=1834s)

#### External Links/Papers
- [*End-to-end Interpretable Neural Motion Planner*, Zeng et al. CVPR'19](https://arxiv.org/abs/2101.06679)
	- [PDF](https://arxiv.org/pdf/2101.06679.pdf)
- [*Jointly Learnable Behavior and Trajectory Planning for Self-Driving Vehicles*, Sadat et al. IROS'19](https://arxiv.org/abs/1910.04586)
	- [PDF](https://arxiv.org/pdf/1910.04586.pdf)
- [*Perceive, Predict, and Plan: Safe Motion Planning Through Interpretable Semantic Representations*, Sadat et al. ECCV'20](https://arxiv.org/abs/2008.05930)
	- [PDF](https://arxiv.org/pdf/2008.05930.pdf)
- [*LiDARsim: Realistic LiDAR Simulation by Leveraging the Real World*, Manivasagam et al. CVPR'20](https://arxiv.org/abs/2006.09348)
	- [PDF](https://arxiv.org/pdf/2006.09348.pdf)
- [*MP3: A Unified Model to Map, Perceive, Predict and Plan*, Casas et al. CVPR'21](https://arxiv.org/abs/2101.06806)
	- [PDF](https://arxiv.org/pdf/2101.06806.pdf)


</details>

#

### [AV Development at Massive Scale](https://www.youtube.com/watch?v=3WqooCcUpn0) <a id="tariq"></a>
<table><tr> <td> <b> <a href="https://www.linkedin.com/in/sarahtariq/">Sarah Tariq</a> </b> </td><td> Nvidia </td><td> 28 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

<img width="550" alt="Screen Shot 2022-08-28 at 9 20 06 AM" src="https://user-images.githubusercontent.com/90723578/187081519-7adac87a-1e96-4237-8b4e-78b20ebaa6db.png">

> #### If you are here to learn new, useful information, please skip this talk. It will be uncomfortable to watch. However, if you like entertainment, please continue, as Nvidia's presentation far exceeds any April fools joke I've seen, with its cleverness and attention to detail.

#### Talk given by Sarah Tariq, the VP of Autonomous Driving Software at NVIDIA

- "Nvidia announced a partnership with Mercedes last year to build **the world's leading platform** for AV functionality in consumer cars", starting in 2024 [1:32](https://www.youtube.com/watch?v=3WqooCcUpn0&t=92s)
    - "This functionality includes very basic active safety functionality, but then it also includes driving, um, autonomously, from address to address on *regular routes*..." [1:50](https://www.youtube.com/watch?v=3WqooCcUpn0&t=110s)
    - "We're enabling *large amounts* of AV functionality, from active safety, all the way up to level 4!" [2:17](https://www.youtube.com/watch?v=3WqooCcUpn0&t=137s)
- At [2:35](https://www.youtube.com/watch?v=3WqooCcUpn0&t=155s), she talks about levels 1-3 of self-driving. Then, "and then you have complex level 4 driving, where the vehicle not only parks or unparks, but can be summoned from a parking spot. It can have a trailer attached, you need to deal with that as well. And *all* of this functionality needs to be supported with a single stack." [3:06](https://www.youtube.com/watch?v=3WqooCcUpn0&t=186s)
- How much compute is necessary for autonomy? [4:29](https://www.youtube.com/watch?v=3WqooCcUpn0&t=269s)
    - "Full self-driving ... requires more than 2,000 TOPs". Thanks. Finally, we have an official, confirmed number that everyone can agree on: 2,000 trillion, or 2 quadrillion, operations per second. (Tesla HW3 does 144 trillion ops per second).
    - <img width="600" alt="Screen Shot 2022-08-27 at 9 36 59 PM" src="https://user-images.githubusercontent.com/90723578/187056260-c1d57d3c-5fe4-41bb-83fa-a6d02d700337.png">
    - "The L3 version of the sensor stack has to have some extra capability"
    - <img width="600" alt="Screen Shot 2022-08-27 at 9 41 57 PM" src="https://user-images.githubusercontent.com/90723578/187056353-2bc91c11-3349-4f3f-8ab6-63455ba5cee7.png">
- "World-class neural networks" [7:31](https://www.youtube.com/watch?v=3WqooCcUpn0&t=451s)
    - While discussing their industry-leading neural networks, she mentions "But then there's more complex stuff. You need to estimate distance to things. You need to estimate your paths, especially if there's no maps." [7:54](https://www.youtube.com/watch?v=3WqooCcUpn0&t=474s)
- "A lot of advanced planning maneuvers requrie HD maps. And that's a vital component for self-driving technology. You can do some things without a map, but much more functionality is enabled once you have a map." [8:34](https://www.youtube.com/watch?v=3WqooCcUpn0&t=514s)
- "It starts with needing to have a really good map. Maps are an important component for realistic generation scenarios for testing." [17:00](https://www.youtube.com/watch?v=3WqooCcUpn0&t=1020s)
- FINALLY! Some results [23:02](https://www.youtube.com/watch?v=3WqooCcUpn0&t=1382s)
- <img width="600" alt="Screen Shot 2022-08-27 at 10 09 28 PM" src="https://user-images.githubusercontent.com/90723578/187057020-f99bc352-bfdf-4c2d-bcf7-0f187d33e4eb.png">
- "A network trained on just simulated data is **not** going to do that well in the real world." [23:51](https://www.youtube.com/watch?v=3WqooCcUpn0&t=1431s)
- ...30 seconds later...
- "We were able to train and test our parking end-to-end with object detection running on our simulator, and with the object detector trained entirely on synthetic fisheye lens camera data." [24:10](https://www.youtube.com/watch?v=3WqooCcUpn0&t=1450s)
- "Here's an example of a network that was having trouble detecting truncated large trucks that were very close to us" [25:00](https://www.youtube.com/watch?v=3WqooCcUpn0&t=1500s)
    - "One way of solving for this easily:"
        1. "Find the failure event"
        2. "Generate *massive* amounts of similar data in simulation"
        3. "Retrain with *some* of this data added in"
        4. Problem solved
    - Excellent
    - <img width="600" alt="Screen Shot 2022-08-27 at 10 15 26 PM" src="https://user-images.githubusercontent.com/90723578/187057134-c7560535-5a33-4f5b-8f37-98248eaf076f.png">


### "We basically model the appearance of the world as realistically as possible" ... "the image quality is absolutely unsurpassed". [15:42](https://www.youtube.com/watch?v=3WqooCcUpn0&t=942s) (Except... Nvidia didn't make this - they're using Omniverse's renderer)

<img width="700" alt="Screen Shot 2022-08-27 at 8 47 49 PM" src="https://user-images.githubusercontent.com/90723578/187055277-8f897b8f-4023-49cc-9786-2f44182a8c26.png">

### Meanwhile, [this is **Waabi's** simulator](https://youtu.be/PSZ2Px9PrHg?t=1509), from this same conference. They are a startup, *founded exactly 12 days prior*.

<img width="700" alt="Screen Shot 2022-08-27 at 8 17 40 PM" src="https://user-images.githubusercontent.com/90723578/187054841-3daeb141-0c1d-4a9d-b89c-80490ca4b924.png">
<img width="700" alt="Screen Shot 2022-08-27 at 8 15 46 PM" src="https://user-images.githubusercontent.com/90723578/187054849-45f27402-1e26-41a2-8a2e-8aec7133e093.png">

### Again, here's **Nvidia's** masterpiece. GTA 5 vibes? [25:24](https://www.youtube.com/watch?v=3WqooCcUpn0&t=1524s)

<img width="700" alt="Screen Shot 2022-08-27 at 8 23 09 PM" src="https://user-images.githubusercontent.com/90723578/187054831-ed527800-ac59-46fa-9889-0799a5d7398d.png">
<img width="700" alt="Screen Shot 2022-08-27 at 8 20 04 PM" src="https://user-images.githubusercontent.com/90723578/187054834-cb19ac93-1200-4c4a-93f4-93864cf2414d.png">
<img width="700" alt="Screen Shot 2022-08-27 at 8 13 48 PM" src="https://user-images.githubusercontent.com/90723578/187054836-598ddc81-da59-474e-aece-fcbd516b2830.png">


</details>

#

### [Self-Supervised 3D Vision](https://www.youtube.com/watch?v=YO5fnaRm5L0) <a id="gaidon"></a>
<table><tr> <td> <b> <a href="https://adriengaidon.com/">Adrien Gaidon</a> </b> </td><td> TTI </td><td> 22 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>


- Machine learning Research at TRI [0:33](https://www.youtube.com/watch?v=YO5fnaRm5L0&t=33s)
- Why **Monocular Depth**? Driving, **Robotiq** [1:12](https://www.youtube.com/watch?v=YO5fnaRm5L0&t=72s)
    - Monocular depth means predicting depth from RGB
    - We do this because cameras are common and cheap
    - **QUESTION:** Can we get robust 3D vision thanks to large-scale self-supervision?
    - Example of depth maps [2:23](https://www.youtube.com/watch?v=YO5fnaRm5L0&t=143s)
- Self-Supervised Learning: Geometry as Supervis [3:12](https://www.youtube.com/watch?v=YO5fnaRm5L0&t=192s)
    - Replacing pooling and up-sampling operators by learning compression and decompression models (packing and unpacking) to preserve details important for reconstruction. Preserving these details reduces photometric ambiguities.
- FSM: Full Surround Monodepth [5:03](https://www.youtube.com/watch?v=YO5fnaRm5L0&t=303s)
    - Stitching together multiple cameras to have 360 degree depth
    - When there is **not enough** overlap, we stitch together across time. For instance if there is a gap between the images from camera 1 and camera 2 (1 being in front of 2), we use historical frames from camera 1, which will have covered the gap
- Neural ray surfaces [9:04](https://www.youtube.com/watch?v=YO5fnaRm5L0&t=544s)
- Scalable supervision: Self-Supervised++ [11:09](https://www.youtube.com/watch?v=YO5fnaRm5L0&t=669s)
    - Semi-supervised learning
    - Auto-labeling
    - Sim2Real Transfer
- Robust semi-supervised inference [12:37](https://www.youtube.com/watch?v=YO5fnaRm5L0&t=757s)
- **Dialable Perception** [13:30](https://www.youtube.com/watch?v=YO5fnaRm5L0&t=810s)
    - You can turn on and off the lidar sensor and the model is always able to predict the depth of the scene
    - There is a standard decoder def network like bacnet or monodev2, but in addition we sometimes have a sparse point file as input, using sparse convolutions and learning a representation that we can inject into the skip connections of the encoder/decoder. The adapter weights to do this injection in the skip connections are able to learn to inject it when we have it and otherwise use the skip connections as normal
    - VIDEO EXAMPLES [14:12](https://www.youtube.com/watch?v=YO5fnaRm5L0&t=852s)
- Auto-labeling via **Differentiable Render** [14:44](https://www.youtube.com/watch?v=YO5fnaRm5L0&t=884s)
    - Feed an image to a deep network that outputs some scene-level params that can then be used as an input to a renderer. Renderer can then use those scene descriptions to re-render the input image that was fed into the network. Check the accuracy of the rendered image, and backpropagate to improve
- **Scene Understanding** Multi-task learning for real-time perception [16:29](https://www.youtube.com/watch?v=YO5fnaRm5L0&t=989s)
- Where to get semantic labels? **Sim!** [18:02](https://www.youtube.com/watch?v=YO5fnaRm5L0&t=1082s)
    - **GUDA:** *Sim* + *Self* for *Sem* + *Depth* [19:22](https://www.youtube.com/watch?v=YO5fnaRm5L0&t=1162s)
- Conclusion: Use geometry as supervision on videos [20:30](https://www.youtube.com/watch?v=YO5fnaRm5L0&t=1230s)


#### External Links/Papers

- [Github: TRI-ML/DDAD](https://github.com/TRI-ML/DDAD)
- [Website: Frontiers of Monocular 3D Perception @ CVPR'21](https://sites.google.com/view/mono3d-workshop)
- [*SuperDepth: Self-Supervised, Super-Resolved Monocular Depth Estimation*, Pillai et al. CVPR'18](https://arxiv.org/abs/1810.01849)
	- [PDF](https://arxiv.org/pdf/1810.01849.pdf)
- [*Two Stream Networks for Self-Supervised Ego-Motion Estimation*, Ambrus et al. CoRL'19](https://arxiv.org/abs/1910.01764)
	- [PDF](https://arxiv.org/pdf/1910.01764.pdf)
- [*3D Packing for Self-Supervised Monocular Depth Estimation*, Guizilini et al. CVPR'19](https://arxiv.org/abs/1905.02693)
	- [PDF](https://arxiv.org/pdf/1905.02693.pdf)
	- [Code: ToyotaResearchInstitute/packnet-sfm](https://github.com/ToyotaResearchInstitute/packnet-sfm)
	- [Code: TRI-ML/DDAD](https://github.com/TRI-ML/DDAD)
	- [Code: TRI-ML/packnet-sfm](https://github.com/TRI-ML/packnet-sfm)
- [*Neural Ray Surfaces for Self-Supervised Learning of Depth and Ego-motion*, Vasiljevic et al. CVPR'20](https://arxiv.org/abs/2008.06630)
	- [PDF](https://arxiv.org/pdf/2008.06630.pdf)
	- [Code: TRI-ML/packnet-sfm](https://github.com/TRI-ML/packnet-sfm)
- [*Full Surround Monodepth from Multiple Cameras*, Guizilini et al. CVPR'21](https://arxiv.org/abs/2104.00152)
	- [PDF](https://arxiv.org/pdf/2104.00152.pdf)
- **Semi-supervised Learning**
    - [*Robust Semi-Supervised Monocular Depth Estimation with Reprojected Distances*, Guizilini et al. CoRL'19](https://arxiv.org/abs/1910.01765)
        - [PDF](https://arxiv.org/pdf/1910.01765.pdf)
    - [*Semantically-Guided Representation Learning for Self-Supervised Monocular Depth*, Guizilini et al. ICLR'20](https://arxiv.org/abs/2002.12319)
        - [PDF](https://arxiv.org/pdf/2002.12319.pdf)
        - [Code: TRI-ML/packnet-sfm](https://github.com/TRI-ML/packnet-sfm)
    - [*Sparse Auxiliary Networks for Unified Monocular Depth Prediction and Completion*, Guizilini et al. CVPR'21](https://arxiv.org/abs/2103.16690)
        - [PDF](https://arxiv.org/pdf/2103.16690.pdf)
        - [Code: TRI-ML/packnet-sfm](https://github.com/TRI-ML/packnet-sfm)
- **Auto-labeling** via Differentiable Rendering
    - [*ROI-10D: Monocular Lifting of 2D Detection to 6D Pose and Metric Shape*, Manhardt et al. CVPR'19](https://arxiv.org/abs/1812.02781)
        - [PDF](https://arxiv.org/pdf/1812.02781.pdf)
    - [*Autolabeling 3D Objects with Differentiable Rendering of SDF Shape Priors*, Zakharov et al. CVPR'20](https://arxiv.org/abs/1911.11288)
        - [PDF](https://arxiv.org/pdf/1911.11288.pdf)
        - [Code: TRI-ML/sdflabel](https://github.com/TRI-ML/sdflabel)
    - [*Monocular Differentiable Rendering for Self-Supervised 3D Object Detection*, Beker et al. ECCV'20](https://arxiv.org/abs/2009.14524)
        - [PDF](https://arxiv.org/pdf/2009.14524.pdf)
    - [*Differentiable Rendering: A Survey*, Kato et al. CVPR'20](https://arxiv.org/abs/2006.12057)
        - [PDF](https://arxiv.org/pdf/2006.12057.pdf)
- **Sim2Real Transfer**
    - [*SPIGAN: Privileged Adversarial Learning from Simulation*, Lee et al. ICLR'19](https://arxiv.org/abs/1810.03756)
        - [PDF](https://arxiv.org/pdf/1810.03756.pdf)
    - [*Geometric Unsupervised Domain Adaptation for Semantic Segmentation*, Guizilini et al. ICCV'21](https://arxiv.org/abs/2103.16694)
        - [PDF](https://arxiv.org/pdf/2103.16694.pdf)
    - [*Learning to Track with Object Permanence*, Tokmakov et al. CVPR'21](https://arxiv.org/abs/2103.14258)
        - [PDF](https://arxiv.org/pdf/2103.14258.pdf)
        - [Code: TRI-ML/permatrack](https://github.com/TRI-ML/permatrack)
- **Scene Understanding**: Multi-task learning for real-time perception
    - [*Real-Time Panoptic Segmentation from Dense Detections*, Hou et al. CVPR'19](https://arxiv.org/abs/1912.01202)
        - [PDF](https://arxiv.org/pdf/1912.01202.pdf)
    - [*Hierarchical Lovasz Embeddings for Proposal-free Panoptic Segmentation*, Kerola et al. CVPR'21](https://arxiv.org/abs/2106.04555)
        - [PDF](https://arxiv.org/pdf/2106.04555.pdf)
    - [*Is Pseudo-Lidar needed for Monocular 3D Object detection?*, Park et al. ICCV'21](https://arxiv.org/abs/2108.06417)
        - [PDF](https://arxiv.org/pdf/2108.06417.pdf)
        - [Code: TRI-ML/dd3d](https://github.com/TRI-ML/dd3d)


</details>

#

### [AV2.0: Reimagining autonomous mobility with embodied intelligence](https://www.youtube.com/watch?v=Va-F4qtTQ6g) <a id="kendall"></a>
<table><tr> <td> <b> <a href="https://alexgkendall.com/">Alex Kendall</a> </b> </td><td> Wayve </td><td> 29 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

- **Generalization**: London training data, autonomous driving UK-wide [5:25](https://www.youtube.com/watch?v=Va-F4qtTQ6g&t=325s)
- Intro to **Wayve** [6:09](https://www.youtube.com/watch?v=Va-F4qtTQ6g&t=369s)
- Reimagining mobility with embodied intelligence [7:23](https://www.youtube.com/watch?v=Va-F4qtTQ6g&t=443s)
    - Synthetic data, off-policy data, on-policy data
- Learning representations with 3D geometry and temporal reasoning [8:14](https://www.youtube.com/watch?v=Va-F4qtTQ6g&t=494s)
    - Example of why single-frame reasoning is stupid [8:42](https://www.youtube.com/watch?v=Va-F4qtTQ6g&t=522s)
- Multimodal future prediction [9:09](https://www.youtube.com/watch?v=Va-F4qtTQ6g&t=549s)
    - **FIERY**: Future instance prediction in bird's-eye view from surround monocular cameras [9:35](https://www.youtube.com/watch?v=Va-F4qtTQ6g&t=575s)
        1. Lift features to 3D
        2. Project to bird's-eye view
        3. Temporal model
        4. Present & future distributions
        5. Future prediction
        6. Future instance segmentation and motion
- Prediction examples
    - Intersection #1 [11:57](https://www.youtube.com/watch?v=Va-F4qtTQ6g&t=717s)
    - U-Turn [12:18](https://www.youtube.com/watch?v=Va-F4qtTQ6g&t=738s)
    - Intersection #2 [12:37](https://www.youtube.com/watch?v=Va-F4qtTQ6g&t=757s)
    - Overtaking vehicles [12:53](https://www.youtube.com/watch?v=Va-F4qtTQ6g&t=773s)
- Action conditioned world models towards model-based reinforcement learning for driving [13:05](https://www.youtube.com/watch?v=Va-F4qtTQ6g&t=785s)
- Model architecture
    - Observing and learning - *offline, off-policy data* [13:45](https://www.youtube.com/watch?v=Va-F4qtTQ6g&t=825s)
        - Encode state input into latent representation Z
        - Decode into better output representation, like semantics, motion, or geometry
        - Train dynamics model that can take as inputs this hidden state and the action that was taken, and predict the next state
        - Compare outputs over time and get divergence loss between present and future distributions
    - Imagining to act [15:14](https://www.youtube.com/watch?v=Va-F4qtTQ6g&t=914s)
        - Now, we can predict our own actions further into the future
        - Take an action and learn to output an action, and then we can use our dynamics model and learn to predict the next state, and run this forward recurrently over a longer time period
- Results and imagined futures [16:32](https://www.youtube.com/watch?v=Va-F4qtTQ6g&t=992s)
    - Long time horizon [18:01](https://www.youtube.com/watch?v=Va-F4qtTQ6g&t=1081s)
- Real world examples - learned intelligent behavior
    - [18:29](https://www.youtube.com/watch?v=Va-F4qtTQ6g&t=1109s) Predicting that an oncoming bus will enter our lane and waiting for it to pass
    - Stopping for unknown traffic light and navigating around road works [20:06](https://www.youtube.com/watch?v=Va-F4qtTQ6g&t=1206s)
- **7 grand challenges** for autonomy [21:31](https://www.youtube.com/watch?v=Va-F4qtTQ6g&t=1291s)
    - **Adaptability**: Adapt quickly to different sensors, vehicles, use cases
    - **Off-policy learning**: Train from scalable offline and off-policy data
    - **World modeling**: Understand complex worlds with joint prediction and planning
    - **Uncertainty**: Interpretability: Figure out what's causing decisions and mistakes
    - **Generalization**: Be intelligent in states that it hasn't been trained on
    - **Reward**: Optimize objective for society's changing needs without supervision

#### External Links/Papers

- [Dreaming about Driving, Wayve Blog 2018](https://wayve.ai/blog/dreaming-about-driving-imagination-rl)
- [*World Models*, Ha et al. 2018](https://arxiv.org/abs/1803.10122)
	- [PDF](https://arxiv.org/pdf/1803.10122.pdf)
- [*Learning to Drive in a Day*, Kendall et al. 2018](https://arxiv.org/abs/1807.00412)
	- [PDF](https://arxiv.org/pdf/1807.00412.pdf)
- [*Probabilistic Future Prediction for Video Scene Understanding*, Hu et al. ECCV'20](https://arxiv.org/abs/2003.06409)
	- [PDF](https://arxiv.org/pdf/2003.06409.pdf)
- [*Mastering Atari with Discrete World Models*, Hafner et al. ICLR'21](https://arxiv.org/abs/2010.02193)
	- [PDF](https://arxiv.org/pdf/2010.02193.pdf)
	- [Code: danijar/dreamerv2](https://github.com/danijar/dreamerv2)
- [*FIERY: Future Instance Prediction in Bird’s-Eye View from Surround Monocular Cameras*, Hu et al. 2021](https://arxiv.org/abs/2104.10490)
    - [PDF](https://arxiv.org/pdf/2104.10490.pdf)
    - [Code: wayveai/fiery](https://github.com/wayveai/fiery)

</details>

#

### [Secure Learning for Autonomous Driving in Adversarial Environments](https://www.youtube.com/watch?v=X1a4rbddz-s) <a id="li2"></a>
<table><tr> <td> <b> <a href="https://aisecure.github.io/">Bo Li</a> </b> </td><td> UIUC </td><td> 28 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

> Note: This is an updated version of Bo's presentation from last year, covering the same topic.

- Intro: Machine learning is used in many places in the physical world, but it has security and privacy concerns
- We are in adversarial environments [2:06](https://www.youtube.com/watch?v=X1a4rbddz-s&t=126s)
- Goal of **Secure Learning Lab**: Design and certify *robust, private*, and *explainable* machine learning paradigms for real-world applications [2:47](https://www.youtube.com/watch?v=X1a4rbddz-s&t=167s)
- Autonomous vehicle architecture [4:15](https://www.youtube.com/watch?v=X1a4rbddz-s&t=255s)
- Examples of mis-classification of stop signs [5:26](https://www.youtube.com/watch?v=X1a4rbddz-s&t=326s) 
- Art perturbation [6:13](https://www.youtube.com/watch?v=X1a4rbddz-s&t=373s)
- Physical attacks against detectors [6:49](https://www.youtube.com/watch?v=X1a4rbddz-s&t=409s)
    - Adversarial stop sign in science museum of London [8:04](https://www.youtube.com/watch?v=X1a4rbddz-s&t=484s)
- **MSF**: widely recognized as a general defense strategy against existing attacks on AD perception [8:31](https://www.youtube.com/watch?v=X1a4rbddz-s&t=511s) (Cao et al. CCS'19, Shin et al. CHES'17, Yang et al. FGCS'18, Ivanov et al. DATE'14, Park et al. ICCPS'15)
- Attack generation against **MSF** [9:04](https://www.youtube.com/watch?v=X1a4rbddz-s&t=544s)
- Real example testing adversarial objects on road [10:30](https://www.youtube.com/watch?v=X1a4rbddz-s&t=630s)
- Diagram: how physical world MSF-based attacks work [11:21](https://www.youtube.com/watch?v=X1a4rbddz-s&t=681s)
- Informing companies about possible vulnerabilities [11:41](https://www.youtube.com/watch?v=X1a4rbddz-s&t=701s)
- Diagram: attacking deep reinforcement learning [12:40](https://www.youtube.com/watch?v=X1a4rbddz-s&t=760s)
- **Traffic level**: Attack on mixed-autonomous automobile traffic [15:18](https://www.youtube.com/watch?v=X1a4rbddz-s&t=918s)
    - **CAN** bus manipulation
- Scene level real-world attack [18:17](https://www.youtube.com/watch?v=X1a4rbddz-s&t=1097s)
    - Generate realistic scenes to attack SOTA point cloud semantic segmentation algorithms
- Knowledge enabled adversarial scene generation [19:19](https://www.youtube.com/watch?v=X1a4rbddz-s&t=1159s)
- How to defend and ensure the safety of AV in *adversarial* environments? [21:08](https://www.youtube.com/watch?v=X1a4rbddz-s&t=1268s)
    - Proposed defenses [21:19](https://www.youtube.com/watch?v=X1a4rbddz-s&t=1279s)
- Robust ML pipeline with exogenous information [23:10](https://www.youtube.com/watch?v=X1a4rbddz-s&t=1390s)
- Certified robustness for *sensing-reasoning* ML pipelines [24:11](https://www.youtube.com/watch?v=X1a4rbddz-s&t=1451s)
- End-to-end robustness certification [24:55](https://www.youtube.com/watch?v=X1a4rbddz-s&t=1495s)
- Challenges and opportunities [25:19](https://www.youtube.com/watch?v=X1a4rbddz-s&t=1519s)
- Knowledge enhanced ML pipeline against *diverse* adversarial attacks [25:53](https://www.youtube.com/watch?v=X1a4rbddz-s&t=1553s)
- Experimental results [27:00](https://www.youtube.com/watch?v=X1a4rbddz-s&t=1620s)

#### External Links/Papers
- [Electrek: *Video of Tesla Model 3 crashing into a truck on Autopilot goes viral*](https://electrek.co/2020/06/01/tesla-model-3-crashing-truck-autopilot-video-viral/)
- [Taiwan English News: *Tesla on autopilot crashes into overturned truck*](https://taiwanenglishnews.com/tesla-on-autopilot-crashes-into-overturned-truck/)
- [*Invisible for both Camera and LiDAR: Security of Multi-Sensor Fusion based Perception in Autonomous Driving Under Physical-World Attacks*, Cao et al. IEEE S&P'21](https://arxiv.org/abs/2106.09249)
	- [PDF](https://arxiv.org/pdf/2106.09249.pdf)
- [MSF-ADV: *3D Adversarial Object against MSF-based Perception in Autonomous Driving*](https://aisecure.github.io/BLOG/MRF/Home.html)
- [*Semantically Controllable Generation of Physical Scenes with Explicit Knowledge*, Ding et al. ICLR'22](https://openreview.net/forum?id=K3bGe_-aMV)
    - [PDF](https://openreview.net/pdf?id=K3bGe_-aMV)
- [Code: AI-secure/Provable-Training-and-Verification-Approaches-Towards-Robust-Neural-Networks](https://github.com/AI-secure/Provable-Training-and-Verification-Approaches-Towards-Robust-Neural-Networks)


</details>

<br>


### _Challenges_
---

### [Argoverse Challenge](https://www.youtube.com/watch?v=DM8jWfi69zM) <a id="argoverse2"></a>
<table><tr> <td> <b> Argo AI </b> </td><td> 55 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

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

</details>

#

### [Waymo Open Dataset](https://www.youtube.com/watch?v=sjXI_FKYw4Y) <a id="opendataset"></a>
<table><tr> <td> <b> Waymo </b> </td><td> 61 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

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

</details>

---

</details>

<br>

<details><summary><h2>2020</h2></summary>

### _Keynotes_

### [Secure Learning in Adversarial Autonomous Driving Environments](https://www.youtube.com/watch?v=0VfBGWnFNuw) <a id="li"></a>
<table><tr> <td> <b> <a href="https://aisecure.github.io/">Bo Li</a> </b> </td><td> UIUC </td><td> 27 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

> Note: Bo gives a similar, updated presentation in 2021, with the same title, and about the same topic. Scroll up to see her latest work.

- Threat Model in AV perception [2:03](https://www.youtube.com/watch?v=0VfBGWnFNuw&t=123s)
- An optimization approach to creating robust physical adversarial examples [3:28](https://www.youtube.com/watch?v=0VfBGWnFNuw&t=208s)
- Optimizing Spatial constraints (Handling limits on imperceptibility) [5:53](https://www.youtube.com/watch?v=0VfBGWnFNuw&t=353s)
- Video examples of misclassifications in the real world [8:19](https://www.youtube.com/watch?v=0VfBGWnFNuw&t=499s)
- AV Perception, and going from image space to 3D space [10:58](https://www.youtube.com/watch?v=0VfBGWnFNuw&t=658s)
- Adversarial Point Clouds - **PointNet** [11:32](https://www.youtube.com/watch?v=0VfBGWnFNuw&t=692s)
- Adversarial 3D Meshes [14:05](https://www.youtube.com/watch?v=0VfBGWnFNuw&t=845s)
- Real world examples - physical experiments: adv-front [15:34](https://www.youtube.com/watch?v=0VfBGWnFNuw&t=934s)
- Challenges for MSF (Multi-Sensor Fusion) systems [17:43](https://www.youtube.com/watch?v=0VfBGWnFNuw&t=1063s)
- Adversarial attacks against MSF [18:14](https://www.youtube.com/watch?v=0VfBGWnFNuw&t=1094s)
    - Adversarial Object against Physical MSF [18:57](https://www.youtube.com/watch?v=0VfBGWnFNuw&t=1137s)
    - Video examples in **Apollo** simulation: driving facing adversarial object [20:02](https://www.youtube.com/watch?v=0VfBGWnFNuw&t=1202s)
- Pipeline: end-to-end robustness with knowledge [21:25](https://www.youtube.com/watch?v=0VfBGWnFNuw&t=1285s)
- Defensing adversarial behaviors in videos - Temporal dependency [24:01](https://www.youtube.com/watch?v=0VfBGWnFNuw&t=1441s)
- Video examples [25:51](https://www.youtube.com/watch?v=0VfBGWnFNuw&t=1551s)


</details>

#

### [Machine Learning for Autonomous Driving at Scale](https://www.youtube.com/watch?v=BV4EXwlb3yo) <a id="anguelov"></a>
<table><tr> <td> <b> Drago Anguelov </b> </td><td> Waymo </td><td> 35 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

- In-car video examples [2:30](https://www.youtube.com/watch?v=BV4EXwlb3yo&t=150s)
- Explanation of self-driving problem [3:58](https://www.youtube.com/watch?v=BV4EXwlb3yo&t=238s)
    - **Sensors:** LiDAR, Camera, Radar
- Why is it a difficult problem? [4:53](https://www.youtube.com/watch?v=BV4EXwlb3yo&t=293s)
    - Complex input, millions of pixels, lidar data
    - Environment diversity
- Examples of scene configuration, agent interactions, rare events [6:25](https://www.youtube.com/watch?v=BV4EXwlb3yo&t=385s)
    - These make it difficult because you can't learn by crashing
- Diagram of autonomous system design [8:25](https://www.youtube.com/watch?v=BV4EXwlb3yo&t=505s)
- **STINet** model: Simultaneous detection tracking and prediction [12:09](https://www.youtube.com/watch?v=BV4EXwlb3yo&t=729s)
    - Detection results [14:22](https://www.youtube.com/watch?v=BV4EXwlb3yo&t=862s)
    - Prediction results [14:54](https://www.youtube.com/watch?v=BV4EXwlb3yo&t=894s)
    - **VectorNet** structured scene context encoding [15:20](https://www.youtube.com/watch?v=BV4EXwlb3yo&t=920s)
        - Map features are simplified into geometry represented as **polylines**, made up of polyline subgraphs
        - Use global interaction graph to model interactions between these map features
    - **Global interaction graph** [17:32](https://www.youtube.com/watch?v=BV4EXwlb3yo&t=1052s)
        - Two loss functions:
            - Loss for trajectory prediction
            - Map completion loss (complete missing road graph features)
- Experimental results: VectorNet [18:01](https://www.youtube.com/watch?v=BV4EXwlb3yo&t=1081s)
- **Waymo open dataset** as of June 2020 [19:28](https://www.youtube.com/watch?v=BV4EXwlb3yo&t=1168s)
    - 1950 20s scenes at 10Hz: 5 lidar, 5 cameras
- **CHALLENGES: Waymo Open Dataset** [20:43](https://www.youtube.com/watch?v=BV4EXwlb3yo&t=1243s)
    - 5 challenges: 2D detection & tracking, 3D detection & tracking, domain adaptation
- Intro to **ViDAR**, and typical **Deep SfM frameworks** [22:29](https://www.youtube.com/watch?v=BV4EXwlb3yo&t=1349s)
    - Estimate future motion given depth information
- **ViDAR** Characteristics and Applications [24:16](https://www.youtube.com/watch?v=BV4EXwlb3yo&t=1456s)
- Video examples of depth maps from RGB images [26:17](https://www.youtube.com/watch?v=BV4EXwlb3yo&t=1577s)
- Consistency Modeling Framework [27:27](https://www.youtube.com/watch?v=BV4EXwlb3yo&t=1647s)
- Simulation: **SurfelGAN** [28:55](https://www.youtube.com/watch?v=BV4EXwlb3yo&t=1735s)
    - Typical methods of simulation (game engine) aren't good
    - SurfelGAN uses existing Waymo sensor data to re-construct environment
    - using **Surfel** for scene reconstruction [30:51](https://www.youtube.com/watch?v=BV4EXwlb3yo&t=1851s)
    - Network Architecture [33:08](https://www.youtube.com/watch?v=BV4EXwlb3yo&t=1988s)
    - Novel View Rendering [33:46](https://www.youtube.com/watch?v=BV4EXwlb3yo&t=2026s)
    - Novel Scene Configuration [34:15](https://www.youtube.com/watch?v=BV4EXwlb3yo&t=2055s)

#### External Links/Papers

- [*STINet: Spatio-Temporal-Interactive Network for Pedestrian Detection and Trajectory Prediction*, Zhang et al. CVPR'20](https://arxiv.org/abs/2005.04255)
	- [PDF](https://arxiv.org/pdf/2005.04255.pdf)
- [*PointPillars: Fast Encoders for Object Detection from Point Clouds*, Lang et al. CVPR'19](https://arxiv.org/abs/1812.05784)
	- [PDF](https://arxiv.org/pdf/1812.05784.pdf)
	- [Code: nutonomy/second.pytorch](https://github.com/nutonomy/second.pytorch)
- [*End-to-End Multi-View Fusion for 3D Object Detection in LiDAR Point Clouds*, Zhou et al. CoRL'19](https://arxiv.org/abs/1910.06528)
	- [PDF](https://arxiv.org/pdf/1910.06528.pdf)
- [*IntentNet: Learning to Predict Intention from Raw Sensor Data*, Casas et al. CoRL'18](https://arxiv.org/abs/2101.07907)
	- [PDF](https://arxiv.org/pdf/2101.07907.pdf)
- [*VectorNet: Encoding HD Maps and Agent Dynamics from Vectorized Representation*, Gao et al. CVPR'20](https://arxiv.org/abs/2005.04259)
	- [PDF](https://arxiv.org/pdf/2005.04259.pdf)
- [*Taskology: Utilizing Task Relations at Scale*, Lu et al. CVPR'20](https://arxiv.org/abs/2005.07289)
	- [PDF](https://arxiv.org/pdf/2005.07289.pdf)
- [*SurfelGAN: Synthesizing Realistic Sensor Data for Autonomous Driving*, Yang et al. CVPR'20](https://arxiv.org/abs/2005.03844)
	- [PDF](https://arxiv.org/pdf/2005.03844.pdf)


</details>

<br>


### _Challenges_
---

### [Argoverse Challenge](https://www.youtube.com/watch?v=Vcbj_peZT4Q) <a id="argoverse"></a>
<table><tr> <td> <b> Argo AI </b> </td><td> James Hays </td><td> 28 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

- **3D Tracking Challenge** [0:19](https://www.youtube.com/watch?v=Vcbj_peZT4Q&t=19s)
    - Winners summary [1:21](https://www.youtube.com/watch?v=Vcbj_peZT4Q&t=81s)
    - 1st Place: **Alibaba_AD_Lab** [3:41](https://www.youtube.com/watch?v=Vcbj_peZT4Q&t=221s)
        - Title: *Occlusion-aware Tracking and Fusion Algorithm*
        - Visualization of Results [4:26](https://www.youtube.com/watch?v=Vcbj_peZT4Q&t=266s)
    - Honorable Mention: **Test_A**: Andrey Pak [5:06](https://www.youtube.com/watch?v=Vcbj_peZT4Q&t=306s)
        - Title: *Simple Gaussian Mixture Filter*
        - Simple Gaussian mixture Filter [5:13](https://www.youtube.com/watch?v=Vcbj_peZT4Q&t=313s)
    - Honorable Mention: **MSU CANVAS**: Su Pang and Hayder Radha [6:11](https://www.youtube.com/watch?v=Vcbj_peZT4Q&t=371s)
- **Motion Forecasting Challenge** [12:24](https://www.youtube.com/watch?v=Vcbj_peZT4Q&t=744s)
    - Winners summary [13:10](https://www.youtube.com/watch?v=Vcbj_peZT4Q&t=790s)
    - 1st Place: **Team Jean**: Jean Mercat et al [16:15](https://www.youtube.com/watch?v=Vcbj_peZT4Q&t=975s)
        - Title: *Multi-Head Attention for Multi-Modal Vehicle Motion Forecasting v2: Look-Ahead Self-Correction*
    - Honorable Mention: **HYU_ACE**: Seong Hyeon Park et al [17:55](https://www.youtube.com/watch?v=Vcbj_peZT4Q&t=1075s)
        - Title: *Diverse and Admissable Trajectory Forecasting through Multimodal Context Understanding*
    - Honorable Mention: **mtz**: Francesco Marchetti et al [18:54](https://www.youtube.com/watch?v=Vcbj_peZT4Q&t=1134s)
        - Title: *MANTRA: Memory-Augmented Neural TRAjectory prediction*
    - Other: **WIMP, Argo AI**: Siddhesh Khandelwal et al [20:13](https://www.youtube.com/watch?v=Vcbj_peZT4Q&t=1213s)
        - Title: *What-If Motion Predictor*
        - Visualization [21:20](https://www.youtube.com/watch?v=Vcbj_peZT4Q&t=1280s)
    - Other: **UberATG-LaneGCN**: Ming Liang et al [22:50](https://www.youtube.com/watch?v=Vcbj_peZT4Q&t=1370s)

</details>

</details>

<br>
<br>

# General
---



### [Tesla AI Day 2021 Cut](https://www.youtube.com/watch?v=keWEE9FwS9o) <a id="aiday2021"></a>
<table><tr> <td> <b> <a href="https://karpathy.ai/">Andrei Karpathy</a>, Ashok Elluswamy, Ganesh V. </b> </td><td> Tesla Daily </td><td> 20 <b>Aug 2021</b> </td><td> 19 min </td> </tr></table>

<details><summary> <b> Notes </b> </summary>

- Full Self-Driving [1:01](https://www.youtube.com/watch?v=keWEE9FwS9o&t=61s) - Andrei Karpathy (Sr. Dir. of AI)
- 4D vector labeling [3:24](https://www.youtube.com/watch?v=keWEE9FwS9o&t=204s) - Andrei Karpathy
- Auto-labeling [4:30](https://www.youtube.com/watch?v=keWEE9FwS9o&t=270s) - Ashok Elluswamy (Dir. of Autopilot Software)
- Tracking objects [6:28](https://www.youtube.com/watch?v=keWEE9FwS9o&t=388s) - Ashok Elluswamy
- Tesla simulation [8:15](https://www.youtube.com/watch?v=keWEE9FwS9o&t=495s) - Ashok Elluswamy
- Dojo supercomputer [9:46](https://www.youtube.com/watch?v=keWEE9FwS9o&t=586s) - Milan Kovac (Dir. of Eng. of Autopilot), Ganesh V. (Sr. Dir. Autopilot Hardware)
- Tesla Bot humanoid [16:18](https://www.youtube.com/watch?v=keWEE9FwS9o&t=978s) - Elon Musk

</details>

### [Tesla AI Day 2021 Cut (How lane changing works)](https://www.youtube.com/watch?v=W5Eo5EEbt0s) <a id="lanechanging"></a>
<table><tr> <td> <b> Ashok Elluswamy </b> </td><td> CNET Highlights </td><td> 19 <b>Aug 2021</b> </td><td> 6 min </td> </tr></table>
