package br.com.eduardo.cadastro.view;

import java.util.ArrayList;
import java.util.List;

import org.primefaces.model.DualListModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.eduardo.cadastro.business.EtecSB;
import br.com.eduardo.cadastro.model.Etec;
import br.com.etechoracio.common.view.BaseMB;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Controller
@Scope("view")
public class EtecMB extends BaseMB {
	
	@Autowired
	private EtecSB etecSB;
	
	private Etec edit = new Etec();
	
	private DualListModel<Etec> etec;
	
	public void postConstruct() {
		List<Etec> source = etecSB.findAll();
		etec = new DualListModel<Etec>(source, new ArrayList<Etec>());
	}
	
	public void onSave() {
		try{
		etecSB.save(edit);
		showInsertMessage();
	} catch(Exception e){
		showErrorMessage(e.getMessage());
	}
		
	}
}
