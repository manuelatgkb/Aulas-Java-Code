class Cliente{
    #nome;
    #sobrenome;
    #cpf;
    #id;

    get nome(){
        return this.#nome
    }
    set nome(nome){
        this.#nome= nome
    }

    get sobrenome(){
        return this.#sobrenome
    }
    set sobrenome(sobrenome){
        this.#sobrenome= sobrenome
    }

    get cpf(){
        return this.#cpf
    }
    set cpf(cpf){
        this.#cpf= cpf
    }

    get id(){
        return this.#id
    }
        set id(id){
            this.#id= id
        }

}
export default Cliente