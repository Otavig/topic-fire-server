import mongoose from "mongoose";
import {v4 as uuidv4} from "uuid";
import messageSchema from './messageSchema.js'

const talksSchema = new mongoose.Schema({
    _id: {
        type: String,
        default: uuidv4
    },
    topics: [String],
    messages: [messageSchema],
    total_msgs: Number
}, {colletion: "talks"});

const Talk = mongoose.model('Talks', talksSchema);
export default Talk;