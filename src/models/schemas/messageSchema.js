import mongoose from "mongoose";
import {v4 as uuidv4} from "uuid";

const messageSchema = new mongoose.Schema({
    _id: {
        type: String,
        default: uuidv4
    },
    user: String,
    msg: String
}, { _id: false });

messageSchema.add({
    res: messageSchema
});

export default messageSchema;
