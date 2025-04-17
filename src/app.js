import express from "express";
import routes from "./routes/routes.js"; 
import corsMiddleware from './middlewares/cors.js'; 
import notFound from "./middlewares/notFound.js";

const app = express();

app.use(corsMiddleware);
app.use(express.json());
app.use('/api', routes);
app.use(notFound);

export default app;
