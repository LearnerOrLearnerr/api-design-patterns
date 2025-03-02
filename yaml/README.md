# API Design Patterns

# Starting point

## List of suppliers
Get a list of supplier IDs

### Request

```sh
GET http://grocer/content/v1/suppliers
```

### Response
```json
{
    [
    {
        "id" : 255
    },
    {
        "id": 300
    },
    {
        "id": 319
    }
    ]
}
```


## List of products for supplier id
Get a list of products for a specific supplier (supplier ID).

### Request
```sh
GET http://grocer/content/v1/suppliers/123/products
```

### Response
```json
{
    "supplier" :
    {
        "id": 123,
        "products" : [
        {
            "id": 1234,
            "name": "Chocolate Bar XYZ",
            "sellUnit": "piece",
            "sellUnitPrice": 1,
            "sellUnitCurrency": "GBP",
            "weight": "500",
            "weightUnit": "g", 
            "imageUrl": "https://greengrocers/images/1234",
            "catalogIdsReference": null,
            "barCode": "99999",
            "ingredients": ["Chocoloate", "Sugar"]
        }
        ]
    }
}
```


## Single product detail
Get a single product detail for a given supplier and product ID

### Request
```sh
GET http://grocer/content/v1/suppliers/123/products/225
```

### Response
```json
data:
{
    "supplierId": 123,
    "products" : [ 
    {
        "id": 1234,
        "name": "XYZ Chocolate Bar",
        "sellUnit": "piece",
        "sellUnitPrice": 1,
        "sellUnitCurrency": "GBP",
        "weight": "500",
        "weightUnit": "g", 
        "imageUrl": "https://greengrocers/images/1234",
        "catalogIdsReference": null,
        "barCode": "99999",
        "ingredients": ["Chocoloate", "Sugar"]
    },
    {
        "id": 1235,
        "name": "Tikatoocoo",
        "sellUnit": "piece",
        "sellUnitPrice": 5,
        "sellUnitCurrency": "GBP",
        "weight": "250",
        "weightUnit": "g", 
        "imageUrl": "https://greengrocers/images/1235",
        "catalogIdsReference": null,
        "barCode": "99991",
        "ingredients": ["Coco", "Sugar", "Milky"]
    }]
}
```

## List of all products

Get a list of all the suppliers’ products

### Request
```sh
GET http://grocer/content/v1/products
```

### Response
```json
[
    {
        "supplierId": 123,
        "products" : [ 
        {
            "id": 1234,
            "name": "XYZ Chocolate Bar",
            "sellUnit": "piece",
            "sellUnitPrice": 1,
            "sellUnitCurrency": "GBP",
            "weight": "500",
            "weightUnit": "g", 
            "imageUrl": "https://greengrocers/images/1234",
            "catalogIdsReference": null,
            "barCode": "99999",
            "ingredients": ["Chocoloate", "Sugar"]
        },
        {
            "id": 1235,
            "name": "Tikatoocoo",
            "sellUnit": "piece",
            "sellUnitPrice": 5,
            "sellUnitCurrency": "GBP",
            "weight": "250",
            "weightUnit": "g", 
            "imageUrl": "https://greengrocers/images/1235",
            "catalogIdsReference": null,
            "barCode": "99991",
            "ingredients": ["Coco", "Sugar", "Milky"]
        }]
    },
    {
        "supplierId": 225,
        "products" : [ 
        {
            "productId": 4466,
            "name": "Kulkuli",
            "sellUnit": "piece",
            "sellUnitPrice": 3,
            "sellUnitCurrency": "GBP",
            "weight": "250",
            "weightUnit": "ml", 
            "imageUrl": "https://greengrocers/images/4466",
            "catalogIdsReference": null,
            "barCode": "99990",
            "ingredients": ["Coco", "Sugar", "Milky"]
        }
        ]
    }
]
```
