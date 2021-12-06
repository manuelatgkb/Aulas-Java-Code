import {Sequelize} from "sequelize";
import Database from "./Database.js";

const ClienteTable = Database.define('conta', {
id:{
    type: Sequelize.INTEGER,
    allowNull: false,
    autoIncrement: true,
    primaryKey: true
}, 
nome:{
    type: Sequelize.STRING,
    allowNull: false,
    autoIncrement: true,
    primaryKey: true
},
sobrenome:{
    type: Sequelize.STRING,
    allowNull: false,
    autoIncrement: true,
    primaryKey: true
},
 cpf:{
     type: Sequelize.STRING,
     allowNull: false,
     autoIncrement: true,
    primaryKey: true
 }
});

export default ClienteTable;