package gui.controllers;

	
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.List;

import gui.models.BookSearchModel;
import gui.models.DashboardPageModel;
import gui.views.BookSearchView;
import gui.views.DashboardPageView;

	public class BookSearchController {
	    private BookSearchModel model;
	    private BookSearchView view;

	    public BookSearchController(BookSearchModel model, BookSearchView view) {
	        this.model = model;
	        this.view = view;
	        initView();
	    }

	    private void initView() {
	        view.addSearchButtonActionListener(e -> performSearch());
	        view.addDashboardButtonActionListener(e -> openDash());
	        view.setVisible(true);
	    }

	    private void performSearch() {
	        String searchType = view.getSelectedSearchType();
	        String searchValue = view.getSearchValue().toLowerCase();
	        List<String[]> results = model.readAndFilterBooksFromCsv(searchType, searchValue);
	        view.updateSearchResultsTable(results);
	    }
	    
	    private void openDash()
	    {
	    	view.setVisible(false); 
	    	 DashboardPageView d = new DashboardPageView();
	            DashboardPageModel model = new DashboardPageModel();
	            DashboardPageController controler = new DashboardPageController(d, model);
	           
	    }

	    
	}
