import { produto } from "./produto";
import { categoria } from "./categoria";

const p = new produto();
p.nome = "Geladeira";
p.marca = "Brastemp";
p.quantidade = 2;
console.log(p);

const c = new categoria();
c.IdProduto= 1;
c.descricao= "Geladeira FrostFree 400litros, prata";
console.log(c);