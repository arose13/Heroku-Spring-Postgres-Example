# Heroku-Database-Example
 REST controls: 
- ('/people') prints the list of all people in the DB
- ('/add/{name}') save the {name} to the DB
- ('/get/{name}') gets a particular person by name from the DB

- You can run this locally by going to commandline and in the project directory calling 
```
$ gradle bootrun
```

# How to set up Heroku
You'll need to set a SPRING_CLOUD_APP_NAME environment variable because it Heroku doesn't just give this to you like other platforms. Also set the SPRING_PROFILES_ACTIVE environment variable and name it the same profile you've given it in the code. In my case I've called it 'cloud'.
```
$ heroku create --stack cedar
$ heroku addons:create heroku-postgresql
$ heroku config:set SPRING_CLOUD_APP_NAME={HEROKU-APPNAME-1234}
$ heroku config:set SPRING_PROFILES_ACTIVE=cloud
```

# Goal
Get a Postgres DB to work for this project.
PS: to run projects on Heroku you'll need a 'Procfile' 
