
# Welcome to Driver Drowsiness Detector 🚗 
A countless number of people drive on the highway day and night. Taxi drivers, bus drivers, truck drivers and people traveling long-distance suffer from lack of sleep. Due to which it becomes very dangerous to drive when feeling sleepy.
The majority of accidents happen due to the drowsiness of the driver. So, to prevent these accidents we will build a system using Python, OpenCV, and Keras which will alert the driver when he feels sleepy.
Welcome to Driver Drowsiness Detector 👋

## Acknowledgements

 - [Awesome Readme Templates](https://awesomeopensource.com/project/elangosundar/awesome-README-templates)
 - [Awesome README](https://github.com/matiassingers/awesome-readme)
 - [How to write a Good readme](https://bulldogjob.com/news/449-how-to-write-a-good-readme-for-your-github-project)


## Authors

- Github: [@yadavsejal19](https://github.com/yadavsejal19)



# Documentation


##The Model Architecture
The model we used is built with Keras using Convolutional Neural Networks (CNN). A convolutional neural network is a special type of deep neural network which performs extremely well for image classification purposes. A CNN basically consists of an input layer, an output layer and a hidden layer which can have multiple layers. A convolution operation is performed on these layers using a filter that performs 2D matrix multiplication on the layer and filter.

The CNN model architecture consists of the following layers:

Convolutional layer; 32 nodes, kernel size 3
Convolutional layer; 32 nodes, kernel size 3
Convolutional layer; 64 nodes, kernel size 3
Fully connected layer; 128 nodes
The final layer is also a fully connected layer with 2 nodes. A Relu activation function is used in all the layers except the output layer in which we used Softmax.


## Project Prerequisites
The requirement for this Python project is a webcam through which we will capture images. You need to have Python (3.6 version recommended) installed on your system, then using pip, you can install the necessary packages.

OpenCV – pip install opencv-python (face and eye detection).
TensorFlow – pip install tensorflow (keras uses TensorFlow as backend).
Keras – pip install keras (to build our classification model).
Pygame – pip install pygame (to play alarm sound).


## Steps for Performing Driver Drowsiness Detection
### Step 1 – Take Image as Input from a Camera
### Step 2 – Detect Face in the Image and Create a Region of Interest (ROI)
### Step 3 – Detect the eyes from ROI and feed it to the classifier
### Step 4 – Classifier will Categorize whether Eyes are Open or Closed
### Step 5 – Calculate Score to Check whether Person is Drowsy

## Output 


![Capture](https://user-images.githubusercontent.com/49943890/167852860-595a2631-1a6a-42bc-a8b4-46fab9da6079.PNG)
![low score](https://user-images.githubusercontent.com/49943890/167852880-803a6232-eb64-4e0f-ae29-3506e4c01bdb.PNG)

## Support

Give a ⭐️ if this project helped you!
