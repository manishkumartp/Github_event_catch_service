# Github_event_catch_service

## Installation and startup steps: -

* **Clone the repo**

* **Use Eclipse or any other IDE to import as maven project**

* **Build the project**

* **Run the server**

* **Check the server on localhost:8080** (If not check port is acquired or not? If yes change port.)

* **Install ngrok server to expose service externally** (That is needed to to expose your service externally so that webhook can connect.)

* **Reference to install ngrok** https://dashboard.ngrok.com/get-started

* **Once ngrok server started expose the API by command $ ./ngrok http 8080**
 
* **Configure the webhook for repo creeation as mention in link https://developer.github.com/webhooks/creating/

* **As soon you create new repo you will get notification in service.
