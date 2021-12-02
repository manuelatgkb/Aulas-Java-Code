import {response, Router} from 'express';
import conta from "./../model/conta.js"
import ContaRepository from "./../repository/ContaRepository.js";
import ContaApi from './api/ContaApi.js'

const ContaApi = Router();
const repository = new ContaRepository();


ContaApi.get('/', async(req, resp)=>{
    const lista = await respository.findAll();
    resp.send(list);
});

ContaApi.post('/', async(req, resp)=>{
    let {numero, agencia, saldo} = req.body;
    const conta = new Conta();
    const retorno = await ContaRepository.create(conta);
    resp.send(retorno);
});  

ContaApi.put('/:id', async(req, resp)=>{
    let id = req.params.id;
    let {numero, agencia, saldo} = req.body;
    const conta = new Conta(numero, agencia, saldo, id);
   const retorno = await ContaRepository.update(conta);
   resp.send(retorno);

});   
   ContaApi.delete('/:id', async(req, resp)=>{
       const id = req.paramas.id;
   const retorno = await ContaRepository.delete(id);
   resp.send(JSON.stringify(retorno));
});  

export default ContaApi;