# TestInRest
Demo project for Autumn QC Meetup. Developed on java wiht the of Rest Assured lib.

HOW TO RUN
1. Clone repository and open project in your java IDE (I work in IDEA).
2. Open terminal in your IDE and run command: mvn clean verify.
3. After running all 24 tests and "BUILD SUCCESS" message find new created folder "target" with report.
4. Path to report: targer => site => serenity => index.html
5. Open generated report in your browser.



Links for Demo:
Postman:
  * https://postman-echo.com/get?test=123 - for test workable Postman
  * https://jsonplaceholder.typicode.com/photos - full json with all photos 
  * https://jsonplaceholder.typicode.com/comments/1 - just first post
  * https://jsonplaceholder.typicode.com/posts?userId=1 - just 10 post where userId=1 


Browser Console:
(open console in browser and paste inside)
fetch('https://jsonplaceholder.typicode.com/todos/1')
  .then(response => response.json())
  .then(json => console.log(json))


