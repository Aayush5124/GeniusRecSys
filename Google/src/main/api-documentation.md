# API Documentation

## Endpoints

### GET /api/items
- **Description**: Retrieve a list of items.
- **Parameters**: None
- **Response**: List of items in JSON format.

### POST /api/feedback
- **Description**: Submit user feedback for an item.
- **Parameters**:
    - `userId`: User ID
    - `itemId`: Item ID
    - `rating`: Rating given by the user
- **Response**: Confirmation message.
