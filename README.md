<h1>Project goal and model-specific features</h1>

<h2> Project goal: It is a project whose goal is to predict the price of a laptop by entering the features (specifications) of this laptop, where the application estimates the price using a pre-trained learning machine model using various real data about the specifications and prices of the laptop. </h2>
------------------------------------------------------------

<h1> Features selected: </h1>

<h2> Brand: The brand that manufactures the laptop from these companies,
(ASUS - ACER - DELL - HP - LENOVO - MSI) This feature was placed in the data collection form because it is an essential feature (but it was excluded from the training) because it does not affect the price of the laptop. </h2>

<h2> 2. State: The condition of the laptop, which is represented by one of two states (new/used) and is one of the features that significantly affects the price of the laptop. </h2>

<h2> 3. CPU (Central Processing Unit (Processor)): The Central Processing Unit is the primary axis that determines the performance of the laptop and determines its price, the processors it is trained on (Core i3 – Core i5 – Core i7 – Core i9). </h2>

<h2> 4. Generation: The generation (processor generation) is also an important and integrated feature of the processor and is an element that greatly affects the price. Generations that were trained on:
(6Gth - 7Gth - 8Gth - 9Gth - 10Gth - 11Gth - 12Gth - 13Gth). </h2>

<h2> 5. CPU Model (processor class): It means one of the two classes (U/H), where the U class is an energy-saving class, while the H class is for high performance (gaming devices), which is a feature that has a noticeable impact on the price of the laptop. </h2>

<h2> 6. Screen Resolution: An important feature of any laptop that affects the price of the laptop is the resolution it is trained on: (HD - FHD - QHD). </h2>

<h2> 7. Memory (RAM): There is no doubt that the size of the RAM makes a difference in the performance of the laptop, which means that it also affects the price of the laptop, which is the goal of training. Sizes that were trained on: (32GB - 16GB - 12GB - 8GB - 4GB). </h2>

<h2> 8. Memory Gen (type of RAM): RAM performance varies from one type (generation to another), as the speed and frequency of the RAM differ, which constitutes a clear difference in the performance and price of the laptop.
Generations trained on: (DDR5 - DDR4 - DDR3). </h2>

<h2> 9. Storage (hard disk capacity): Storage capacity is one of the specifications on which the price is also based, and it has several sizes. It was trained on: (256GB – 512GB – 1T). </h2>

<h2> 10. Storage Model (Hard Type): The specifications are an important feature regarding storage, as the difference in the hard drive constitutes a difference in performance and therefore the price of the laptop. It has two types (SSD - HDD). </h2>

<h2> 11. GPU (graphics processing unit (screen card)): The graphics processing unit is the second most important part of the laptop after the processor and greatly affects the price of any converter computer.
Types trained on:
(- RTX3060 - RTX3050 - RTX2070 - RTX2060 - RTX2050 RTX3070 RTX4050 - MX130 - GTX1660 - GTX1650 - RTX4070 - RTX4060 - MX550 - Built-in). </h2>

<h2> 12. Screen Size: This has been taken into consideration, as it also affects the price
Types trained on: 14 - 15.6 - 17.3)). </h2>

<h2> 13. Genuine Windows: Also one of the features that may slightly affect the price. </h2>

<h2> 14. Backlit Keyboard: A little impressive. </h2>

---------------------------------------------------------------------------
<h1> Technologies used in the project </h1>

<h2> FrontEnd: Flutter environment (mobile app) was used in the project as the user interface. </h2>

<h2> BackEnd: Python language was used as BackEnd. </h2>

<h4> API: Fast API technology was used to connect the mobile application to the algorithm written in Python. </h4>

<h4> Database: CSV files were used as databases. </h4>



<h1> Structure </h1>

<h4> FrontEnd: The Flutter application, which represents the user interface, receives the data and then sends it to the API, where it requests the expected value from the API after it finishes working. </h4>
<h4> BackEnd: The API function captures the values from the request coming from the interface and then passes them to the algorithm function. </h4>
<h3> Algoritm:</h3><h4> The algorithm function processes the input data (converting it to the corresponding numbers), then passes it to the model previously saved in a separate file, calculates the expected value, and then returns it to the API function, which returns it to the user interface. </h4>
<h5> - Note: The training part and the model were created in a separate file, where the model is saved in an external file (so that we do not have to train for each request). </h5>
