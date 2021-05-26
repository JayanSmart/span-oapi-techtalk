# span-oapi-techtalk

This is a simple API flask server, python sdk and testing "app" all generated from a single OpenAPI specification

To run the API server:
```bash
cd flask/
# building the image
docker build -t swagger_server .

# starting up a container
docker run -p 8080:8080 swagger_server
```

Test that it is working:
```bash
curl -X GET http://localhost:8080/v1/tenure/0
```

Install the python SDK package:
```bash
cd client/
python3 setup.py install #This may need sudo privileges
```

Run the SimplePythonApp:
```bash
cd simplePythonApp/
python3 main.py
```