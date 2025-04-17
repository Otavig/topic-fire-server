import listAllTalks from "../services/listAllTalks.js";

const talkings = {
    hello: (req, res) => {
      res.status(200).json({ mensagem: 'Hello World!' });
    },

    getTalkings: (req, res) => {
      try {
        res.status(200).json(listAllTalks);
      } catch (error) {
        res.status(500).json({error: 'Error in search' });
      }
    }

  };
  
export default talkings; 
  