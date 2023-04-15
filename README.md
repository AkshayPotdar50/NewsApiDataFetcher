# NewsApiDataFetcher
this api will help user to fetch data according to stories in news
this application is designed according to following requirement sheet
Use the Hacker News API available at the Link to build the API backend for the users.



Users should be able to do the following:

1.       /top-stories - Should return the top 10 stories ranked by the score in the last 15 minutes (Read Instructions), Each story should have a title, URL, score, time of submission, and the user who submitted it.

2.       /past-stories - Should return all the stories that were served previously from the 1st endpoint (/top-stories).

3.       /comments - Should return 10 comments (max) on a given story sorted by a total number of child comments. Each comment should contain comment text, the user’s hacker news handle.

 

Instructions:

1.       To prevent overloading the Hacker News APIs and getting blocked from Hacker News firebase, Implement appropriate caching so that the clients fetching your data will see the same cached data for up to 15 mins.

2.       You are free to use any database.

3.       Your solution will be evaluated for its code quality, test coverage, architecture, and performance.

4.       Brownie points for setting up your project to run inside Docker
