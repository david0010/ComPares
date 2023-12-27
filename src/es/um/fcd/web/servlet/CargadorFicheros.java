package es.um.fcd.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.um.fcd.util.AppLogger;
import es.um.fcd.web.controller.ActionLibrary;

public abstract class CargadorFicheros extends MyHttpServlet {
	private static final long serialVersionUID = 1L;
	protected String directorioPath;

	public void init(ServletConfig config) {
		try {
			super.init(config);

			// Recuperamos el directorio donde se guardaran los documentos
			directorioPath = config.getInitParameter(getDirectorio());
		} catch (Exception e) {
			AppLogger.logException(e);
		}
	}
	
	protected abstract String getDirectorio();

	protected void reenviarIndex(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(new ActionLibrary().execute(request, response, getServletConfig().getServletContext()));
		rd.forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reenviarIndex(request, response);
	}
}
