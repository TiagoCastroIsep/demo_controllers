import requests
import json

url = "http://localhost:8080"

data = requests.get(f"{url}/house")

dict = data.json()

print(f"Data in the server: {dict}")

send_json_obj = json.dumps({"name": "h4", "doorNumber": 4})

response = requests.post(f"{url}/house", send_json_obj, headers={'Content-Type': 'application/json'})

print(f"Server response: {response.status_code}")

updated_data = requests.get(f"{url}/house")
print(f"Updated data from server: \n{updated_data.json()}")