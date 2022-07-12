
# Divar desktop app

<p align="center">
  <img src = "readmeContext/head.png" height = "350">
</p>

## Developers

**Update Galaxy team:**
- [**Mohammad Rouintan **](https://github.com/MohammadRouintan)
- [**Abolfazl Ramezanian**](https://github.com/abolfazl30not30)
- [**Mahdi Ahmadi**](https://github.com/mr-robber)
- [**Reza Mosavi**]((https://github.com/rezamosavi8740))
\
  \
  _Computer Science students at Shahid Beheshti University_
  \
  Mathematical sciences' faculty
  
### Summary
This project is developed as the final project for our advanced Java programming course at SBU.
\
Our application is meant to be a template of Divar desktop application.
### Features
  
- __**Graphical User Interface**__
  \
  \
  contains an impressive GUI, designed and implemented by JavaFX technology

  -  _login and sign up_
  
    <p align="center">
      <img src = "ReadMeContent/1.png" height = "350">
    </p>

  -  _main feed_
    <p align="center">
      <img src = "ReadMeContent/2.png" height = "350">
    </p>

  -  _add post_
    <p align="center">
      <img src = "ReadMeContent/3.png" height = "350">
    </p>

  - _user search_
    <p align="center">
      <img src = "ReadMeContent/4.png" height = "100">
    </p>
  
  - _profile_
    <p align="center">
      <img src = "ReadMeContent/5.png" height = "350">
    </p>
  - _followers and followings list_
    <p align="center">
      <img src = "ReadMeContent/6.png" height = "350">
    </p>
  - _direct messaging_
    <p align="center">
      <img src = "ReadMeContent/7.png" height = "350">
    </p>
  - _post_
    <p align="center">
      <img src = "ReadMeContent/8.png" height = "350">
    </p>
    <p align="center">
      <img src = "ReadMeContent/9.png" height = "350">
    </p>
    <p align="center">
      <img src = "ReadMeContent/10.png" height = "350">
    </p>
    <p align="center">
      <img src = "ReadMeContent/11.png" height = "350">
    </p>
  - _likes list_
    <p align="center">
      <img src = "ReadMeContent/12.png" height = "350">
    </p>

- __**Object-orientation**__

this project is implemented in an absolutely object-oriented approach. since we used Java for this project,
we tried to use the full power of Java in terms of object orientation. the project is very well organized and maintainable
because every part of the program is developed within a separate package obviously-named. Each package consists of 
classes and fxml files of its own. we tried to obey the SOLID rules as much as we could in this project.

<p align="center">
  <img src = "readmeContext/oop.png" height = "350">
</p>

- __**Version Control tools**__

Our team work was organized and merged and developed upon Git and we made separate branches for different kind of tasks
and after implementing an specific part of the project the team members would push the changes and notifying the
maintainer of the project to merge their changes after checking their provided code.

- __**Team work**__

The entire project was developed under four main phases
- 1st phase: designing and building an API
- 2nd phase: implementing follow,profile,login,sign up features
- 3rd phase: implementing direct,post,comment,like features
- 4th phase: adding additional features and testing and debugging the whole project

Each phase very well organized and divided into separate tasks assigned to a developer and having a due date
\
[Task Boards](https://gitlab.com/update-galaxy-group/instagram-app/-/boards/2842705)
\
[Git graph](https://gitlab.com/update-galaxy-group/instagram-app/-/network/master)
\
[Contributions](https://gitlab.com/update-galaxy-group/instagram-app/-/graphs/master)

- __**Database**__

For this project MongoDB database is used for storing data on server.
\
Here is the schema:
<p align="center">
  <img src = "readmeContext/db.png" height = "350">
</p>

- __**Socket Programming**__

This project consists of two different applications, a client app and a server app developed by the socket programming tools and 
concpets in Java

- __**Multi-threading**__

To handle numerous clients simultaneously on server-side multi-threading concepts are used. clients are 
handled by being passed to a threadpool and shared methods between multiple threads are synchronized to avoid 
the race condition and data loss
