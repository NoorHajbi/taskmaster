# taskmaster

# Lab: 32 - Integrating AWS for Cloud Data Storage

Is to use AWS Amplify as a backend. 

## Feature Tasks
Tasks Are Cloudy
Using the amplify add api command, create a Task resource that replicates our existing Task schema. Update all references to the Task data to instead use AWS Amplify to access your data in DynamoDB instead of in Room.

## Add Task Form
Modify your Add Task form to save the data entered in as a Task to DynamoDB.

## Homepage
Refactor your homepage’s RecyclerView to display all Task entities in DynamoDB.

## Documentation
Update your daily change log with today’s changes.

## Testing
Ensure that all Espresso tests are still passing (since we haven’t changed anything about the UI today, no new updates required).

## Stretch Goals
Cache data fetched from DynamoDB into your local Room database.
Submission Instructions
Continue working in your taskmaster repo.
Work on a non-master branch and make commits appropriately.
Update your README with your changes for today and screenshot of your work.
Create a pull request to your master branch with your work for this lab.
Submit the link to that pull request on Canvas. Add a comment with the amount of time you spent on this assignment.
Grading Rubric
2 pts Amplify client created in MainActivity
2 pts Data is posted and displayed based on DynamoDB status, not local DB status
1 pt README with description, screenshots, and daily change log

## Resources
Amplify Getting Started

//screenShots are missing
//more work on readme

## Previous labs documentation

| Lab no.       | Link to the documentation  |         
| ------------|-----------------------------|
|Lab: 26|[Beginning TaskMaster](labs/LAB26.md)|
|Lab: 27|[Data in TaskMaster](labs/LAB27.md)|
|Lab: 28|[RecyclerView](labs/LAB28.md)|
|Lab: 29|[Room](labs/LAB29.md)|
|Lab: 31|[Espresso and Polish](labs/LAB31.md)|