# MavenAppStarter
Starter template for maven projects

## Available API routes
* Book routes
* video routes

### Book routes
#### {serverName}/
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
#### {serverName}/
* addBook (protected route)
  CREATE a video

* videos
  GET all books, returns JSONData

* video/{id}
  GET book with a given id

* videoName/{video}
  GET book with unique name

* update/video/{id}(protected route)
  UPDATE a video

* delete/video/{id}(protected route)
  DELETE a video
  

### How to access protected routes
* Get an access token
{localhost:1709}/authenticate