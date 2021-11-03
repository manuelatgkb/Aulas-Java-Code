package Repositório_Novo.model;

abstract class abstrataId {
    public String id;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof abstrataId){
            abstrataId AID = (abstrataId)obj;
            if(this.id.equals(AID.id)){
                return true;
            }
        }
        return false;
    }
}
