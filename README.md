# JournalApp
Post: http://localhost:8080/addEntry
Request Body:
{
    "taskName":"heello",
    "taskDescription":"taskDescription",
    "taskDate":"2024-02-24",
    "createdBy":"createdBy"
}
Response:
{
    "success": true,
    "errorMessage": null,
    "data": {
        "taskId": 3,
        "taskName": "heello",
        "taskDescription": "taskDescription",
        "taskDate": "2024-02-24",
        "createdBy": "createdBy",
        "updatedBy": "createdBy",
        "createdTs": "2023-01-24T17:39:10.014",
        "updatedTs": "2023-01-24T17:39:10.014"
    }
}
