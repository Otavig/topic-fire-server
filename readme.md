# TopicsFire Server

TopicsFire Server is the backend service for managing and delivering topics in real-time. This project is designed to handle requests efficiently and provide a robust API for client applications.

## Features

- Real-time topic management.
- RESTful API for client interaction.
- Scalable and modular architecture.
- Secure and reliable data handling.

## Requirements

- **Node.js** (version 16 or higher)
- **npm** (version 7 or higher)
- **Database**: MongoDB or any compatible database.

## Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/Otavig/topic-fire-server.git
    cd topicsfire-server
    ```

2. Install dependencies:
    ```bash
    npm install
    ```

3. Configure environment variables:
    Create a `.env` file in the root directory and set the required variables:
    ```env
    PORT=3000
    DATABASE_URL=mongodb://localhost:27017/topicsfire
    JWT_SECRET=your_secret_key
    ```

4. Start the server:
    ```bash
    npm start
    ```

## API Endpoints

### Authentication (Coming Soon)
- `POST /api/auth/login` - User login.
- `POST /api/auth/register` - User registration.

### Talks
- `GET /api/talks` - Retrieve all talk.
- `POST /api/talks` - Create a new talk.
- `PUT /api/talks/:id` - Update a talk.
- `DELETE /api/talks/:id` - Delete a talk.

### Messages (Coming soon)
- `GET /api/talks/:id/messages` - Retrieve all message.


## Development

To run the server in development mode with live reload:
```bash
npm run dev
```

## Testing

Run the test suite:
```bash
npm test
```

## Contributing

Contributions are welcome! Please follow these steps:
1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Commit your changes and push the branch.
4. Submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).