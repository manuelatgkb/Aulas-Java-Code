import {Sequelize} from "sequelize";
import Database from "./Database.js";

const ContaTable = Database.define('conta', {
id:{
    type: Sequelize.INTEGER,
    allowNull: false,
    autoIncrement: true,
    primaryKey: true
}, 
numero:{
    type: Sequelize.STRING,
    allowNull: false,
    autoIncrement: true,
    primaryKey: true
},
agencia:{
    type: Sequelize.STRING,
    allowNull: false,
    autoIncrement: true,
    primaryKey: true
},
 saldo:{
     type: Sequelize.FLOAT,
     allowNull: false,
     autoIncrement: true,
    primaryKey: true
 }
});

export default ContaTable;