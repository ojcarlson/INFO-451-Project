Spring 2023 Project
Indiana University Southeast
INFO-451
Inventory Software
Olaf Carlson
ocarlson@iu.edu

Objective: Development of a plug in Inventory Management Application that works in the field for your technicians to speed up your inventory validation across your Network Infrastructure saving your corporation time and money.  Technicians need a inventory system that will keep track of actionable inventory that is user friendly, efficient and accurate to have that equipment on hand for your customers. 

Use Cases: 
Login/Logout using corporate logins and passwords
Search and display your Inventory
Create Inventory
Remove Inventory
Display and print your Inventory
Change Inventory Quantity Counts and Status’s

How to run the code in it's current form:

Will need an IDE to run the code in and establish the backend in Docker creating mysql database mydatabase with table Inventory includes buildingLoction, heci, description, cost, bayLocation, status and quantity.  Table login/password that includes login and password table.

The software in current form is in console program and the GUI will be developed by final presentation with option to create return shipping document to return equipment.  Here is your selection at console program.  Run InventorySystem.java to start program.

 Inventory Menu
_____________________________
  1.  Login 
  2.  Search Inventory and Display
  3.  Create Inventory
  4.  Remove Inventory Equipment at Building Location
  5.  Display All Building Inventories
  6.  Change Inventory Quantity Count
  7.  Change Inventory Status
  8.  Exit

Please input your choice <1-4>:

Please input your choice <1-4>:1

Please Corporate USER NAME: (Enter User Name)
Please enter CORPORATE PASSWORD: (Enter Password)
display one of two options
	Password Accepted!
	Not found please try again!

Please input your choice <1-4>:2
Please input 2 digit state and four digit Building Location: NE9253
Please input the equipment Status: SPARE
Please input the equipment HECI: WPQSS1245
display one of two options
	Inventory found!
	Not found please try again!

Please input your choice <1-4>:3
Please input 2 digit state and four digit Building Location: NE5555
Please input the equipment HECI: WPQS9989
Please input the equipment Description: COMM DEVICE
Please input the equipment Cost: 89.99
Please input the equipment Bay Location: 010009.03
Please input the equipment Status: SPARE
Please input the Quantity: 2
Building account created successfully!

Please input your choice <1-4>:4
Please input 2 digit state and four digit Building Location: NE9253
Please input the equipment HECI: WPQSS1245
display one of two options
	Inventory Delete Successful!
	Not found please try again!

Please input your choice <1-4>:5
buildingLocation : NE9253 heci : WPSVSS1265description : SONET PACK cost: 555.99 bayLocation: 102.35 status: INSERVICE quantity: 5
buildingLocation : NE9253 heci : STPQSS14545description : REPEATER PACK cost: 423.99 bayLocation: 102.35 status: INSERVICE quantity: 5
buildingLocation : NE9999 heci : STPQSV14545description : REPEATER AMP PACK cost: 423.99 bayLocation: 102.35 status: INSERVICE quantity: 5
buildingLocation : NE8888 heci : WPQ9999description : POWER PACK cost: 999.99 bayLocation: 3001.03 status: INSTALL quantity: 10
buildingLocation : NE6666 heci : PWPQSTVL89description : POWER PACK cost: 999.88 bayLocation: 3002.04 status: INSERVICE quantity: 2
buildingLocation : NE5555 heci : WPQS9989description : COMM DEVICE cost: 89.99 bayLocation: 10009.03 status: SPARE quantity: 2

Please input your choice <1-4>:6
Please input 2 digit state and four digit Building Location: NE9253
Please input the equipment HECI: WPSVSS1265
Please input the equipment Bay Location: 102.35
Please input the equipment Status: INSERVICE
Please input the NEW QUANTITY: 1
display one of two options
	Building QUANTITY changed successfully!
	Not found please try again!

Please input 2 digit state and four digit Building Location: NE9253
Please input the equipment HECI: WPSVSS1265
Please input the equipment Bay Location: 102.35
Please input the NEW equipment Status: SPARE
display one of two options
	Building CHANGE INVENTORY STATUS changed successfully!
	Not found please try again!

Please input your choice <1-4>:7
Please input 2 digit state and four digit Building Location: NE9253
Please input the equipment HECI: WPSVSS1265
Please input the equipment Bay Location: 102.35
Please input the NEW equipment Status: SPARE
display one of two options
	Building CHANGE INVENTORY STATUS changed successfully!
	Not found please try again!
