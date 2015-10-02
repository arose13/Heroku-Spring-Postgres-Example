# This is the Procfile for Gradle apps
# Importantly for Heroku you REQUIRE a java, port and profile for this to work both locally and in Heroku's cloud
web: java $JAVA_OPTS -Dserver.port=$PORT -Ddatabase.url=$DATABASE_URL -Dspring.profiles.active=cloud -jar app.jar