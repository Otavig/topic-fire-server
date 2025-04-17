import app from "./src/app.js";
import dotenv from "dotenv";
import './src/config/mongoConnection.js';

dotenv.config();

const PORT = process.env.PORT || 3000;

app.listen(PORT, () => {
    console.log(`Running server in the port ${PORT}`);
});