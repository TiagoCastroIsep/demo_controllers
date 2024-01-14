from flask import Flask
import requests

app = Flask(__name__)

@app.route("/py_api", methods=["get"])
def manipulate_house_list():
  url = "http://localhost:8080"

  data = requests.get(f"{url}/house")

  dict = data.json()

  print(f"Data received from Server: {dict}")

  print(f"Filtered data on Python Server: {dict[0]}")

  return dict[0]

if __name__ == "__main__":
  app.run(debug=True)