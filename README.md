# MavenAppStarter
Starter template for maven projects

## Available API routes
* Book routes
* video routes

### How to access protected routes
## NB:
##### All routes are protected
* Get an access token [Request-Type - POST, Content-Type-application/json]
  {localhost:1709}/authenticate

## The username name and password have been hardcoded
* ### username: jay
* ### password: pass

### Book routes
#### {localhost:1709}/
* addBook (non-protected route)
CREATE a book

* books
GET all books, returns JSONData

* book/{id}
GET book with a given id

* bookName/{book}
GET book with unique name

* update/{id}(protected route)
UPDATE a book

* delete/{id}(protected route)
DELETE a book

### Video routes
#### {localhost:1709}/
* addVideo 
  CREATE a video

* videos
  GET all books, returns JSONData

* video/{id}
  GET video with a given id

* videoName/{video}
  GET video with unique name

* update/video/{id}(protected route)
  UPDATE a video

* delete/video/{id}(protected route)
  DELETE a video
  

