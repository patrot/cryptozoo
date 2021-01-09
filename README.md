# cryptozoo

## API Specifications

**Resource Summary**

| URI                                      | HTTP Method |   HTTP Status   | Description                              |
|------------------------------------------|-------------|-----------------|------------------------------------------|
| cryptozoo.com/api/animals                | GET         |      200 OK     | Return a list of animals.                |
| cryptozoo.com/api/animals                | POST        |   201 CREATED   | Form submission to add a new animal.     |
| cryptozoo.com/api/animals/<animal_id>    | PUT         |      200 OK     | Update and return an existing animal.    |
| cryptozoo.com/api/habitats               | GET         |      200 OK     | Return a list of habitats.               |
| cryptozoo.com/api/habitats               | POST        |   201 CREATED   | Form submission to add a new habitat.    |
| cryptozoo.com/api/habitats/<habitat_id>  | PUT         |      200 OK     | Update and return an existing habitat.   |

---

**GET /api/animals**

Response Body:
```json
[
  {
    "id": "41acbb7a-ebc8-40b7-8281-70635e3466b8",
    "name": "Bird",
    "type": "flying",
    "mood": "happy"
  },
  {
    "id": "b8a504e8-7cbd-4a54-9a24-dc1832558162",
    "name": "Fish",
    "type": "swimming",
    "mood": "unhappy"
  }
]
```