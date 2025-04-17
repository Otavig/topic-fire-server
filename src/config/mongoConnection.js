import mongoose from "mongoose";
import dotenv from "dotenv";

dotenv.config();

async function main() {
    await mongoose.connect(`mongodb+srv://otavigdeveloper:${process.env.PASSWORD_MONGO}@cluster0.1exyw.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0`);
    console.log("Connect to MongoDB!");
}


main().catch(err => console.error(err));
