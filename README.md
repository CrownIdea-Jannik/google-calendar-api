#Informations for CrownIdea
##run project
1. maven install
2. run "GoogleCalApplication"
3. open http://localhost:9000/login/google in your browser
4. log in with jannik@crownidea.com account
   1. You will be redirected
   2. You should see a list with every existing event in the calendar
5. Use Postman to create an event in the calendar
   1. http://localhost:9000/events --> POST {
      "clientId": "c_ipm6h5tp31i4fel259tubsh6s0@group.calendar.google.com",
      "start": "2022-06-25T13:00:00",
      "end": "2022-06-25T16:00:00"
      }
   2. <-- {description=Test Description, end={dateTime=2022-06-03T14:00:00.000+02:00}, start={dateTime=2022-06-03T12:00:00.000+02:00}, summary=Test Summary}
6. Open Google Calendar
7. Enable "Booking System Test Calendar"
8. Look at the timeframe (start-end)
   1. There should be a new Event

For other user accounts or calendars, change the application.properties and the "clientId" value in the request.
For more details on this projects look into README_ORIGINAL or the original project this is forked from.
