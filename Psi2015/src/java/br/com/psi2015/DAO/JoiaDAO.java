package br.com.psi2015.DAO;

import br.com.psi2015.entity.Joia;
import br.com.psi2015.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;


public class JoiaDAO {

    private Session sessao;
    private Transaction trans;
    private List<Joia> list;

    public List<Joia> getList() {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();

            Criteria cri = sessao.createCriteria(Joia.class);
            cri.addOrder(Order.asc("nome"));
            this.list = cri.list();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessao.close();

        }
        return list;
    }

    public void addJoia(Joia j) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            Joia joia = new Joia();
            joia.setNuItem(j.getNuItem());
            joia.setNuLote(j.getNuLote());
            joia.setNuPeso(j.getNuPeso());
            joia.setNuValor(j.getNuValor());
            joia.setDsDescricao(j.getDsDescricao());
            joia.setDsObservacao(j.getDsObservacao());
            joia.setNuTipoObjeto(j.getNuTipoObjeto());

            sessao.save(joia);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            sessao.close();
        }
    }

    public void removeJoia(Joia j) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();

            sessao.delete(j);
            trans.commit();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            sessao.close();
        }
        
    }
    
    public void updateJoia(Joia j){
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();
            
            sessao.update(j);
            trans.commit();          
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            sessao.close();
        }
    }
    
}
