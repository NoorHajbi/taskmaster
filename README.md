# taskmaster

# Lab: 38 - Notifications

- Is to add the ability for push notifications to be delivered to the app from the cloud.

## Feature Tasks

### Notifications on Task Creation

- When a new task is created within a team, alert all users who are a part of that team about that new task.

- There are several steps involved in allowing this to work:
    - Store which team a user is part of in the cloud
    - Add a Lambda trigger on task creation
    - Use SNS to send a notification as part of that Lambda


## Screen Shots

<!-- - *Before Adding a task*  
![Before Adding a task](/screenshots/lab37/before_add_a_task.PNG) 

- *After Adding a task*  
![After Adding a task](/screenshots/lab37/after_add_a_task.PNG) 

- *Detail Page*  
![Detail Page](/screenshots/lab37/detail_page.PNG)  -->

2 pts Model updates and device registration
2 pts Lambda code for sending notifications
1 pt Screenshot of a successful notification
1 pt README with description, screenshots, and daily change log


## Resources:
- [Class38- Demo](https://github.com/joj5/401-TEMP/tree/main/curriculum/class-38/demo)
- [Push notifications](https://docs.amplify.aws/sdk/push-notifications/getting-started/q/platform/android/#connect-to-your-backend)

## Previous labs documentation

| Lab no.       | Link to the documentation  |         
| ------------|-----------------------------|
|Lab: 26|[Beginning TaskMaster](labs/LAB26.md)|
|Lab: 27|[Data in TaskMaster](labs/LAB27.md)|
|Lab: 28|[RecyclerView](labs/LAB28.md)|
|Lab: 29|[Room](labs/LAB29.md)|
|Lab: 31|[Espresso and Polish](labs/LAB31.md)|
|Lab: 32|[Integrating AWS for Cloud Data Storage](labs/LAB32.md)|
|Lab: 33|[Related Data](labs/LAB33.md)|
|Lab: 34|[Publishing to the Play Store](labs/LAB34.md)|
|Lab: 36|[Cognito](labs/LAB36.md)|
|Lab: 37|[S3](labs/LAB37.md)|
