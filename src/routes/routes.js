import express from 'express';
import talkings from "../controllers/talkingsController.js";

const router = express.Router();

router.get('/', talkings.hello);
router.get('/talkings', talkings.getTalkings);

export default router;
