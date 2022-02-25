# pingAndroid


I am using a Pixel 5 API 31 emulator to test my application. Due to the security setttings on my own machine and/or the emulator, I can only ping local
and Android specific IP addresses. My application is able to ping external IP addresses (such as 8.8.8.8) on other machines.


# Activities

## MainActivity

* Ping Button redirects users to Menu Activity
* 
![image](https://user-images.githubusercontent.com/41266777/155756821-8e34bc12-b27c-4cca-af72-cab504118c00.png)

## Menu Activity

* User enters an IP address in the EditText
* Back Button redirects user to MainActivity
* Ping button pings the IP address and sends the data to the Result Activity

![image](https://user-images.githubusercontent.com/41266777/155757013-fc7ea2c9-f5a2-4d8a-9591-8c7dca038095.png)


## Result Activity

* Displays the results of pinging the IP address
* Back Button goes back to the menu activity
* Main Menu Buttuon redirects user to the MainActivity

![image](https://user-images.githubusercontent.com/41266777/155757134-ad66b214-3c29-49a6-84df-bbd41157e862.png)



