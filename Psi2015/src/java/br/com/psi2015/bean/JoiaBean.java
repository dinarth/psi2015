package br.com.psi2015.bean;


import br.com.psi2015.DAO.JoiaDAO;
import br.com.psi2015.entity.Joia;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class JoiaBean implements Serializable {

    private Joia joia = new Joia();
    private JoiaDAO joiaDAO = new JoiaDAO();
    private List<Joia> listaJoia;

    public JoiaBean() {
    }

    public List listarJoia() {
        listaJoia = joiaDAO.getList();
        return this.listaJoia;
    }
    
    public String carregarJoia(Joia p){
        this.joia = p;
        return "editar";
    }

    public String adicionarJoia() {
        try {
            joiaDAO.addJoia(joia);
            joia.setIdJoia(null);
            joia.setNuItem(null);
            joia.setNuLote(null);
            joia.setNuPeso(null);
            joia.setNuValor(null);
            joia.setNuTipoObjeto(null);
            joia.setDsDescricao("");
            joia.setDsObservacao("");

            return "index";
        } catch (Exception e) {
            e.printStackTrace();
            return "erro";
        }
    }

    public String removerJoia(Joia p) {
        try {
            this.joia = p;
            joiaDAO.removeJoia(joia);
            joia.setIdJoia(null);
            joia.setNuItem(null);
            joia.setNuLote(null);
            joia.setNuPeso(null);
            joia.setNuValor(null);
            joia.setNuTipoObjeto(null);
            joia.setDsDescricao("");
            joia.setDsObservacao("");

            return "index";
        } catch (Exception e) {
            e.printStackTrace();
            return "erroremove";
        }
    }
    
    public String editarJoia(){
        try {
            joiaDAO.updateJoia(this.joia);
            joia.setIdJoia(null);
            joia.setNuItem(null);
            joia.setNuLote(null);
            joia.setNuPeso(null);
            joia.setNuValor(null);
            joia.setNuTipoObjeto(null);
            joia.setDsDescricao(null);
            joia.setDsObservacao(null);

            return "index";
            
        } catch (Exception e) {
            e.printStackTrace();
            return "erroatualiza";
        }
    
    }

    public Joia getJoia() {
        return joia;
    }

    public void setJoia(Joia joia) {
        this.joia = joia;
    }

}