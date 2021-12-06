import Express from "express";
import Cliente from ".model/Cliente.js"
import ClienteRepository from "./repository/ClienteRepository.js";
import bodyParser from "body-parser";

const api = Express();
api.use(bodyParser.json());
api.listen(3000, ()=>console.log('Rodando...'));

//const repository = new ClienteRepository
//const lista = await repository.findAll();
