import Talk from "../models/talkModel.js"; 

const listAllTalks = async () => {
    return await Talk.find();
};

export default listAllTalks;
